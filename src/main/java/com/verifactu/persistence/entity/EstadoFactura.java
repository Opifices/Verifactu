package com.verifactu.persistence.entity;

/**
 * Estado del envío de la factura a la AEAT.
 */
public enum EstadoFactura {
    /**
     * La factura está en proceso de creación/edición.
     * No tiene hash oficial ni firma aún.
     */
    BORRADOR,

    /**
     * La factura ha sido finalizada, tiene hash encadenado y firma XML.
     * Es inmutable desde el punto de vista del negocio local.
     * Pendiente de envío a la AEAT.
     */
    FIRMADA,

    /**
     * En proceso de envío asíncrono o síncrono.
     */
    ENVIADA,

    /**
     * Aceptada correctamente por la AEAT.
     */
    ACEPTADA,

    /**
     * Aceptada con Errores (La AEAT la registra pero pide subsanación).
     */
    ACEPTADA_CON_ERRORES,

    /**
     * Rechazada por la AEAT (Error de validación de negocio).
     */
    RECHAZADA,

    /**
     * Error técnico (Red, Timeout). Requiere reintento.
     */
    PENDIENTE_ENVIO,
    ERROR_DEFINITIVO,
    ENVIADA_OK,
    PENDIENTE_REINTENTO
}
