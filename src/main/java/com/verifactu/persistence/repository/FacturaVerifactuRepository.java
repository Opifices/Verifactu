package com.verifactu.persistence.repository;

import com.verifactu.persistence.entity.FacturaVerifactu;
import jakarta.persistence.LockModeType;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import org.springframework.data.repository.query.Param;

@Repository
public interface FacturaVerifactuRepository extends JpaRepository<FacturaVerifactu, Long> {

    /**
     * Recupera la última factura generada para obtener su huella.
     * <p>
     * <b>CRÍTICO:</b> Utiliza {@link LockModeType#PESSIMISTIC_WRITE} para bloquear
     * la fila
     * y evitar que otro proceso lea el mismo hash anterior simultáneamente (Race
     * Condition).
     * Esto serializa la generación de facturas en entornos concurrentes,
     * garantizando
     * la integridad de la cadena.
     * </p>
     *
     * @return La última factura registrada, con bloqueo exclusivo.
     */
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT f FROM FacturaVerifactu f WHERE f.serieFactura = :serie ORDER BY f.id DESC LIMIT 1")
    Optional<FacturaVerifactu> findUltimaFacturaConBloqueo(@Param("serie") String serie);

    long countBySerieFactura(String serie);

    // Para el Job de Reintentos con Paginación
    java.util.List<FacturaVerifactu> findByEstado(com.verifactu.persistence.entity.EstadoFactura estado,
            org.springframework.data.domain.Pageable pageable);

    /**
     * Búsqueda por clave de negocio para chequeo de idempotencia.
     */
    Optional<FacturaVerifactu> findBySerieFacturaAndNumeroFactura(String serieFactura, String numeroFactura);

    /**
     * Recuperación simple sin bloqueo, para lecturas informativas.
     */
    Optional<FacturaVerifactu> findTopByOrderByIdDesc();
}
