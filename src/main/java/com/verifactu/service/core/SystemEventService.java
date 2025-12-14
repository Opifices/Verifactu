package com.verifactu.service.core;

import com.verifactu.persistence.entity.EstadoFactura;
import com.verifactu.persistence.entity.FacturaVerifactu;
import com.verifactu.persistence.entity.TipoOperacion;
import com.verifactu.persistence.repository.FacturaVerifactuRepository;
import com.verifactu.service.aeat.AeatClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

/**
 * Servicio para gestionar eventos técnicos de Verifactu (Inicio/Fin de
 * Sistema).
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SystemEventService {

    private final FacturaVerifactuRepository repository;
    private final AeatClientService aeatService;
    private final XmlGeneratorService xmlGenerator;
    private final com.verifactu.service.security.SignatureService signatureService;

    public void registrarEventoInicioSistema() {
        log.info("Generando Evento de INICIO DE SISTEMA...");
        registrarEvento(TipoOperacion.INICIO_SISTEMA);
    }

    public void registrarEventoFinSistema() {
        log.info("Generando Evento de FIN DE SISTEMA...");
        registrarEvento(TipoOperacion.FIN_SISTEMA);
    }

    private void registrarEvento(TipoOperacion tipo) {
        // 1. Generar XML
        String xmlEvento = xmlGenerator.generarXmlEvento(tipo);

        // 2. Firmar (Los eventos de sistema también se firman)
        // Nota: La firma de eventos no siempre encadena igual que las facturas
        // (huellaAnterior puede ser nula o específica)
        // Asumimos cadena vacía o lógica específica.
        String firma = signatureService.firmarXml(xmlEvento);

        FacturaVerifactu evento = FacturaVerifactu.builder()
                .serieFactura("SYS")
                .numeroFactura("EVT-" + System.currentTimeMillis())
                .anteriorHash("")
                .registroHash("HASH_EVENTO_" + tipo)
                .firmaXml(firma)
                .fechaGeneracionHuella(ZonedDateTime.now(java.time.ZoneId.of("Europe/Madrid")))
                .tipoOperacion(tipo)
                .estado(EstadoFactura.FIRMADA)
                .build();

        repository.save(evento);

        try {
            aeatService.enviarFactura(evento);
        } catch (Exception e) {
            log.warn("No se pudo enviar evento de sistema, quedará en reintentos", e);
        }
    }
}
