package com.verifactu.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * Bitácora de comunicaciones con la AEAT.
 * <p>
 * Fundamental para justificar "huecos" temporales ante una inspección.
 * Si hubo 10 fallos de red antes del éxito, deben quedar registrados aquí.
 * </p>
 */
@Entity
@Table(name = "logs_envio_aeat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LogEnvio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "factura_id", nullable = false)
    private FacturaVerifactu factura;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoEventoLog tipo;

    /**
     * Contenido XML enviado o recibido (puede ser grande).
     */
    @Lob
    @Column(name = "payload_xml")
    private String payloadXml;

    /**
     * Mensaje de error o código de respuesta HTTP.
     */
    @Column(length = 500)
    private String mensaje;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime fechaEvento;
}
