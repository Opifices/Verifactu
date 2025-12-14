package com.verifactu.persistence.repository;

import com.verifactu.persistence.entity.LogEnvio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LogEnvioRepository extends JpaRepository<LogEnvio, Long> {

    // Para consultas de inspección: Logs de una factura específica
    List<LogEnvio> findByFacturaIdOrderByFechaEventoAsc(Long facturaId);

    // Para monitorización: Errores recientes
    List<LogEnvio> findByTipoAndFechaEventoAfter(com.verifactu.persistence.entity.TipoEventoLog tipo,
            LocalDateTime fecha);
}
