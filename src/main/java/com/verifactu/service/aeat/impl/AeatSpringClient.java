package com.verifactu.service.aeat.impl;

import com.verifactu.persistence.entity.EstadoFactura;
import com.verifactu.persistence.entity.FacturaVerifactu;
import com.verifactu.persistence.repository.FacturaVerifactuRepository;
import com.verifactu.service.aeat.AeatClientService;
import com.verifactu.service.audit.AuditService; // Added import
import com.verifactu.persistence.entity.TipoEventoLog; // Added import
import com.verifactu.model.xml.generated.*; // Use generated JAXB classes

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Implementación robusta del cliente AEAT con reintentos automáticos.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class AeatSpringClient implements AeatClientService {

    private final FacturaVerifactuRepository repositorio;
    // INYECCIÓN DEL SERVICIO TRANSACCIONAL
    private final AuditService auditService;
    private final WebServiceTemplate webServiceTemplate; // Inyección Real

    @Value("${verifactu.simulation.enabled:true}")
    private boolean simulationEnabled;

    @Override
    @Retryable(retryFor = { IOException.class, RuntimeException.class,
            org.springframework.ws.WebServiceException.class }, maxAttempts = 3, backoff = @Backoff(delay = 2000, multiplier = 2))
    public boolean enviarFactura(FacturaVerifactu factura) {
        log.info("Intentando enviar factura ID: {} a AEAT...", factura.getId());

        auditService.registrarEvento(factura, TipoEventoLog.ENVIO_AEAT,
                "Iniciando envío SOAP...", factura.getFirmaXml());

        try {
            if (simulationEnabled) {
                log.warn("MODO SIMULACIÓN ACTIVO: No se realizará envío real a AEAT.");
                simulateSoapCall();
                // Simulación exitosa
                factura.setCsvRespuesta("CSV_SIMULADO_" + System.currentTimeMillis());
                factura.setEstado(EstadoFactura.ACEPTADA);
            } else {
                // LLAMADA SOAP REAL
                log.info("Iniciando transmisión segura a AEAT (SSL/TLS)...");

                if (factura.getFirmaXml() == null || factura.getFirmaXml().isEmpty()) {
                    throw new IllegalStateException("El XML de la factura no está firmado o está vacío");
                }

                // La llamada SOAP real usando WebServiceTemplate
                StreamSource source = new StreamSource(new StringReader(factura.getFirmaXml()));
                StringWriter resultWriter = new StringWriter();
                StreamResult result = new StreamResult(resultWriter);

                // Enviar
                webServiceTemplate.sendSourceAndReceiveToResult(source, result);
                String responseXml = resultWriter.toString();

                // Procesar respuesta
                // Desempaquetar respuesta JAXB
                // NOTA: Con Jaxb2Marshaller en SoapClientConfig, podemos usar unmarshall si
                // queremos objetos
                // Pero aquí parseamos manualmente o podríamos usar unmarshaller.
                try {
                    Object responseObj = webServiceTemplate.getUnmarshaller()
                            .unmarshal(new StreamSource(new StringReader(responseXml)));

                    if (responseObj instanceof RespuestaRegFactuSistemaFacturacionType) {
                        RespuestaRegFactuSistemaFacturacionType resp = (RespuestaRegFactuSistemaFacturacionType) responseObj;

                        // Verificar Estado Global
                        if (resp.getEstadoEnvio() == EstadoEnvioType.CORRECTO) {
                            factura.setCsvRespuesta(resp.getCSV());
                            factura.setEstado(EstadoFactura.ACEPTADA);
                        } else {
                            // Error o Parcialmente Correcto
                            EstadoFactura estado = (resp.getEstadoEnvio() == EstadoEnvioType.PARCIALMENTE_CORRECTO)
                                    ? EstadoFactura.RECHAZADA // Ojo: Parcialmente correcto podría aceptarse con
                                                              // advertencias, pero simplificamos
                                    : EstadoFactura.RECHAZADA;

                            factura.setEstado(estado);

                            // Extraer primer error si existe (simplificado)
                            if (resp.getRespuestaLinea() != null) {
                                for (RespuestaExpedidaType linea : resp.getRespuestaLinea()) {
                                    if (linea.getEstadoRegistro() != EstadoRegistroType.CORRECTO) {
                                        log.error("Error en Factura {}: [{}] {}",
                                                linea.getIDFactura().getNumSerieFacturaEmisor(),
                                                linea.getCodigoErrorRegistro(),
                                                linea.getDescripcionErrorRegistro());

                                        // Podríamos guardar el primer error en la factura para referencia rápida
                                        if (factura.getMotivoRechazo() == null) {
                                            factura.setMotivoRechazo(linea.getDescripcionErrorRegistro());
                                        }
                                    }
                                }
                            }

                            // Si hay CSV (Parcialmente correcto), lo guardamos
                            if (resp.getCSV() != null)
                                factura.setCsvRespuesta(resp.getCSV());

                            throw new RuntimeException("AEAT devolvió estado: " + estado);
                        }
                    } else {
                        throw new RuntimeException("Tipo de respuesta inesperado: " + responseObj.getClass().getName());
                    }

                } catch (Exception e) {
                    log.error("Error parseando respuesta AEAT", e);
                    throw new RuntimeException("Error procesando respuesta XML", e);
                }
            }

            factura.setIntentosEnvio(factura.getIntentosEnvio() + 1);
            repositorio.save(factura);

            auditService.registrarEvento(factura, TipoEventoLog.RESPUESTA_AEAT,
                    "Envío Completado. Estado: " + factura.getEstado(), factura.getCsvRespuesta());

            log.info("Factura ID: {} procesada. Resultado: {}", factura.getId(), factura.getEstado());
            return factura.getEstado() == EstadoFactura.ACEPTADA;

        } catch (Exception e) { // Captura genérica para incluir excepciones SOAP

            log.warn("Fallo de conexión/SOAP enviando factura {}. Reintentando...", factura.getId());
            auditService.registrarEvento(factura, TipoEventoLog.ERROR_RED,
                    "Fallo envío: " + e.getMessage(), null);
            throw new RuntimeException("Error en comunicación AEAT", e);
        }
    }

    /**
     * método de recuperación (Fallback) cuando se agotan los reintentos.
     * Spring Retry invoca esto automáticamente.
     */
    @Recover
    public boolean recoverEnvio(RuntimeException e, FacturaVerifactu factura) {
        log.error("Agotados todos los intentos de envío para factura {}. Marcando para RETRY diferido.",
                factura.getId(), e);

        // Marcamos como pendiente de reintento manual o batch
        factura.setEstado(EstadoFactura.PENDIENTE_ENVIO);
        // No borramos la firma, solo actualizamos estado

        // Registrar evento de fallo final
        auditService.registrarEvento(factura, TipoEventoLog.ERROR_RED,
                "Abandonado tras reintentos: " + e.getMessage(), null);

        repositorio.save(factura);
        return false;
    }

    private void simulateSoapCall() throws InterruptedException {
        // Simular latencia de red (500ms - 2s)
        long delay = 500 + (long) (Math.random() * 1500);
        Thread.sleep(delay);

        // Simular fallo aleatorio (10% probabilidad)
        if (Math.random() < 0.1) {
            throw new RuntimeException("Simulated Timeout Exception");
        }
    }
}
