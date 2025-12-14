package com.verifactu.service.audit;

import com.verifactu.persistence.entity.FacturaVerifactu;
import com.verifactu.persistence.entity.LogEnvio;
import com.verifactu.persistence.entity.TipoEventoLog;
import com.verifactu.persistence.repository.LogEnvioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuditService {

    private final LogEnvioRepository logRepository;

    /**
     * Guarda un log de auditoría en una transacción independiente.
     * <p>
     * Esto asegura que el log se persista incluso si la transacción de negocio
     * principal
     * hace rollback (por ejemplo, si falla el guardado final de la factura).
     * </p>
     */
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void registrarEvento(FacturaVerifactu factura, TipoEventoLog tipo, String mensaje, String payloadXml) {
        try {
            LogEnvio logEntry = LogEnvio.builder()
                    .factura(factura)
                    .tipo(tipo)
                    .mensaje(mensaje)
                    .payloadXml(payloadXml)
                    .build();
            logRepository.save(logEntry);
            log.debug("Auditoría guardada: {} - {}", tipo, mensaje);
        } catch (Exception e) {
            // Este catch es vital: si falla el log, NO queremos que tire la app entera,
            // pero sí queremos un error grave en consola.
            log.error("CRITICAL: Fallo al guardar auditoría. Posible pérdida de traza legal.", e);
        }
    }
}
