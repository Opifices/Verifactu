package com.verifactu.job;

import com.verifactu.persistence.entity.EstadoFactura;
import com.verifactu.persistence.entity.FacturaVerifactu;
import com.verifactu.persistence.repository.FacturaVerifactuRepository;
import com.verifactu.service.aeat.AeatClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Trabajo programado (Job) encargado de procesar las facturas que fallaron en
 * su envío inicial.
 * <p>
 * Este componente es clave para la resiliencia: asegura que ninguna factura se
 * quede "en el limbo"
 * si hubo una caída de red prolongada.
 * </p>
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class AeatRetryScheduler {

    private final FacturaVerifactuRepository repository;
    private final AeatClientService aeatClient;

    // Ejecutar cada 5 minutos (300000 ms)
    @Scheduled(fixedDelay = 300000)
    public void retryFailedInvoices() {
        log.info("Iniciando Job de Reintento de Facturas Pendientes...");

        int pageSize = 100; // Procesar lotes de 100
        int pageNumber = 0;
        boolean hasNext = true;

        while (hasNext) {
            List<FacturaVerifactu> failedInvoices = repository.findByEstado(
                    EstadoFactura.PENDIENTE_REINTENTO,
                    PageRequest.of(pageNumber, pageSize));

            if (failedInvoices.isEmpty()) {
                hasNext = false;
                break;
            }

            log.info("Procesando lote {} con {} facturas pendientes.", pageNumber, failedInvoices.size());

            for (FacturaVerifactu invoice : failedInvoices) {
                try {
                    // Verificar si ya excedió límites de intentos
                    if (invoice.getIntentosEnvio() >= 5) {
                        invoice.setEstado(EstadoFactura.ERROR_DEFINITIVO);
                        repository.save(invoice);
                        continue;
                    }

                    // Incremento de intentos y reenvío
                    invoice.setIntentosEnvio(invoice.getIntentosEnvio() + 1);
                    boolean sent = aeatClient.enviarFactura(invoice);

                    if (sent) {
                        invoice.setEstado(EstadoFactura.ENVIADA_OK);
                    } else {
                        // Se mantiene en PENDIENTE_REINTENTO
                    }
                    repository.save(invoice);

                } catch (Exception e) {
                    log.error("Error en Job de Reintento para factura " + invoice.getNumeroFactura(), e);
                }
            }

            // Avanzar página solo si se llenó la actual, aunque en reintentos al cambiar
            // estado
            // las facturas salen de la query. En este caso, siempre pedimos la página 0
            // porque los elementos procesados (ENVIADA o ERROR) ya no salen en la query.
            // Para seguridad, mantenemos page 0.
            // pageNumber++;
        }

        log.info("Job de Reintento Finalizado.");
    }
}
