package com.verifactu.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

/**
 * Entidad central que representa un Registro de Facturación Verifactu.
 * <p>
 * Esta entidad almacena tanto los datos de trazabilidad (hashes, firmas) como
 * el estado de comunicación con la AEAT.
 * <p>
 * NOTA: Los datos económicos detallados (Líneas, Cliente) se asumen en tablas
 * relacionadas
 * (no mostradas aquí por brevedad) o embeddables, aquí nos centramos en la
 * metadata Verifactu.
 * 
 * @author Senior Developer
 */
@Entity
@Table(name = "facturas_verifactu", indexes = {
        @Index(name = "idx_hash_registro", columnList = "registroHash", unique = true)
})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FacturaVerifactu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // --- Identificación de Negocio ---

    @Column(nullable = false, length = 60)
    private String serieFactura;

    @Column(nullable = false, length = 60)
    private String numeroFactura;

    // --- Datos Económicos Básicos (Simulados para el MVP) ---
    // En un ERP real, esto vendría de una tabla relacionada, pero Verifactu lo
    // necesita para el XML.

    @Column(precision = 19, scale = 2)
    private java.math.BigDecimal importeTotal;

    @Column(precision = 19, scale = 2)
    private java.math.BigDecimal baseImponible;

    @Column(precision = 19, scale = 2)
    private java.math.BigDecimal cuotaTotal;

    @Column(name = "fecha_expedicion")
    private java.time.LocalDate fechaExpedicion;

    // --- Datos de Seguridad y Trazabilidad (Verifactu Core) ---

    /**
     * Hash del registro anterior en la cadena (Chained Hash).
     * Crítico para garantizar el encadenamiento.
     */
    @Column(name = "anterior_hash", length = 64, nullable = false)
    private String anteriorHash;

    /**
     * Hash SHA-256 de este registro (Huella).
     */
    @Column(name = "registro_hash", length = 64, nullable = false, unique = true)
    private String registroHash;

    /**
     * Firma electrónica XAdES del XML generado.
     * Se almacena como TEXT o CLOB dado su tamaño variable.
     */
    @Lob
    @Column(name = "firma_xml", nullable = false)
    private String firmaXml;

    // --- Comunicación con AEAT ---

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EstadoFactura estado;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoOperacion tipoOperacion;

    /**
     * Código Seguro de Verificación (CSV) devuelto por la AEAT al aceptar.
     */
    @Column(name = "csv_respuesta", length = 100)
    private String csvRespuesta;

    /**
     * Motivo detallado del rechazo si el envío falla.
     */
    @Column(name = "motivo_rechazo", length = 1500)
    private String motivoRechazo;

    /**
     * Contador de reintentos de envío.
     */
    @Column(nullable = false)
    @Builder.Default
    private Integer intentosEnvio = 0;

    // --- Auditoría ---

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime fechaCreacion;

    @UpdateTimestamp
    private LocalDateTime fechaModificacion;

    /**
     * Fecha y hora oficial de generación de la huella/firma.
     * Debe coincidir con el momento del encadenamiento.
     */
    @Column(name = "fecha_generacion_huella", nullable = false)
    private java.time.ZonedDateTime fechaGeneracionHuella; // ZonedDateTime para timezone explícito (ISO 8601)

}
