package com.verifactu.service.core;

import com.verifactu.model.DesgloseImpuestos; // Import explícito
import com.verifactu.model.RegistroAlta;
import com.verifactu.persistence.entity.FacturaVerifactu;
import com.verifactu.persistence.repository.FacturaVerifactuRepository;
import com.verifactu.service.security.SignatureService;
import com.verifactu.util.VerifactuHashUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class InvoiceChainerService {

        private final FacturaVerifactuRepository repositorio;
        private final SignatureService signatureService;
        private final XmlGeneratorService xmlGeneratorService;

        @Transactional(isolation = Isolation.READ_COMMITTED)
        public FacturaVerifactu encadenarFactura(RegistroAlta datos) {
                log.info("Encadenando factura {}/{}", datos.serieFactura(), datos.numeroFactura());

                Optional<FacturaVerifactu> existente = repositorio
                                .findBySerieFacturaAndNumeroFactura(datos.serieFactura(), datos.numeroFactura());
                if (existente.isPresent())
                        return existente.get();

                Optional<FacturaVerifactu> ultimaFactura = repositorio
                                .findUltimaFacturaConBloqueo(datos.serieFactura());
                String huellaAnterior = ultimaFactura.map(FacturaVerifactu::getRegistroHash).orElse("");

                if (ultimaFactura.isEmpty() && repositorio.count() > 0) {
                        // Implementación futura: Validación de integridad de la cadena.
                        // Si existen facturas pero no se encuentra la última de la serie, podría
                        // indicar una ruptura de la cadena.
                }

                String nuevoHash = VerifactuHashUtil.generarHuellaAlta(datos, huellaAnterior);
                String xmlSinFirmar = xmlGeneratorService.generarXmlAlta(datos, nuevoHash, huellaAnterior);
                String firma = signatureService.firmarXml(xmlSinFirmar);

                FacturaVerifactu nueva = FacturaVerifactu.builder()
                                .serieFactura(datos.serieFactura())
                                .numeroFactura(datos.numeroFactura())
                                .anteriorHash(huellaAnterior)
                                .registroHash(nuevoHash)
                                .firmaXml(firma)
                                .fechaGeneracionHuella(ZonedDateTime.now(ZoneId.of("Europe/Madrid")))
                                .tipoOperacion(com.verifactu.persistence.entity.TipoOperacion.ALTA)
                                .estado(com.verifactu.persistence.entity.EstadoFactura.FIRMADA)
                                .build();

                return repositorio.save(nueva);
        }

        @Transactional
        public FacturaVerifactu anularFactura(String serie, String numero, String motivo) {
                Optional<FacturaVerifactu> originalOpt = repositorio.findBySerieFacturaAndNumeroFactura(serie, numero);
                if (originalOpt.isEmpty()) {
                        throw new IllegalArgumentException("Factura no encontrada");
                }

                FacturaVerifactu original = originalOpt.get();
                Optional<FacturaVerifactu> ultima = repositorio.findUltimaFacturaConBloqueo(serie);
                String anteriorHash = ultima.map(FacturaVerifactu::getRegistroHash).orElse("");

                // Inicializamos los valores para la anulación invirtiendo los importes
                // originales
                // Se utiliza una lista vacía explícita para evitar ambigüedades en la
                // sobrecarga del constructor
                BigDecimal impTotal = BigDecimal.ZERO.subtract(
                                original.getImporteTotal() != null ? original.getImporteTotal() : BigDecimal.ZERO);
                BigDecimal baseImp = BigDecimal.ZERO;
                BigDecimal cuota = BigDecimal.ZERO;
                List<DesgloseImpuestos> listaVacia = new ArrayList<>();

                // Construcción del registro de anulación asegurando el tipado correcto de los
                // argumentos
                RegistroAlta datosAnulacion = new RegistroAlta(
                                serie, // serieFactura
                                "ANUL-" + numero, // numeroFactura
                                LocalDate.now(), // fechaExpedicion
                                impTotal, // importeTotal
                                baseImp, // baseImponible
                                cuota, // cuotaTotal
                                listaVacia, // desglose (List<DesgloseImpuestos>)
                                "NIF_EMISOR", // nifEmisor
                                "NOMBRE_EMISOR", // nombreRazonEmisor
                                "NIF_CLIENTE", // nifCliente
                                "NOMBRE_CLIENTE", // nombreRazonCliente
                                "R1", // tipoFactura
                                numero, // numeroFacturaRectificada
                                anteriorHash // huellaAnterior
                );

                String nuevoHash = VerifactuHashUtil.generarHuellaAlta(datosAnulacion, anteriorHash);
                String firma = signatureService.firmarXml("<Anulacion>" + nuevoHash + "</Anulacion>");

                FacturaVerifactu anulacion = FacturaVerifactu.builder()
                                .serieFactura(serie)
                                .numeroFactura("ANUL-" + numero)
                                .anteriorHash(anteriorHash)
                                .registroHash(nuevoHash)
                                .firmaXml(firma)
                                .fechaGeneracionHuella(ZonedDateTime.now(ZoneId.of("Europe/Madrid")))
                                .tipoOperacion(com.verifactu.persistence.entity.TipoOperacion.ANULACION)
                                .estado(com.verifactu.persistence.entity.EstadoFactura.FIRMADA)
                                .build();

                return repositorio.save(anulacion);
        }
}
