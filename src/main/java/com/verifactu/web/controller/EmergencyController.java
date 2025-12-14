package com.verifactu.web.controller;

import com.verifactu.persistence.entity.FacturaVerifactu;
import com.verifactu.persistence.repository.FacturaVerifactuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Controlador administrativo de Emergencia.
 * <p>
 * Solo accesible por Super-Admin. Permite reparar el estado del sistema tras un
 * desastre
 * (ej. pérdida de base de datos) inyectando hashes manualmente para reanudar la
 * cadena.
 * </p>
 */
@RestController
@RequestMapping("/admin/emergency")
@RequiredArgsConstructor
@Slf4j
public class EmergencyController {

    private final FacturaVerifactuRepository repositorio;

    /**
     * Inyecta una factura "dummy" o semilla para restablecer la cadena.
     * Útil si se borraron datos pero se conoce el último hash generado (del log o
     * papel).
     */
    @PostMapping("/seed-chain")
    public ResponseEntity<String> seedChain(@RequestBody SeedRequest request) {
        log.warn("EMERGENCY ACTION: Seeding chain manually with Hash: {}", request.lastHash);

        FacturaVerifactu seed = FacturaVerifactu.builder()
                .serieFactura(request.serie)
                .numeroFactura(request.numero) // Última factura conocida
                .registroHash(request.lastHash)
                .anteriorHash("MANUAL_RECOVERY")
                .tipoOperacion(com.verifactu.persistence.entity.TipoOperacion.ALTA)
                .estado(com.verifactu.persistence.entity.EstadoFactura.ACEPTADA)
                .firmaXml("MANUAL_SEED")
                .fechaGeneracionHuella(java.time.ZonedDateTime.now(java.time.ZoneId.of("Europe/Madrid")))
                .build();

        repositorio.save(seed);
        return ResponseEntity.ok("Cadena restablecida. Siguiente factura encadenará a: " + request.lastHash);
    }

    public record SeedRequest(String serie, String numero, String lastHash) {
    }
}
