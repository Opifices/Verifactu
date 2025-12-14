package com.verifactu.persistence.entity;

/**
 * Tipos de eventos auditables en la comunicación con la AEAT.
 */
public enum TipoEventoLog {
    /**
     * Intento de envío a la AEAT (Request).
     */
    ENVIO_AEAT,

    /**
     * Respuesta exitosa (HTTP 200 + Aceptada/Rechazada por negocio).
     */
    RESPUESTA_AEAT,

    /**
     * Fallo de comunicación (Timeout, 500, DNS).
     */
    ERROR_RED,

    /**
     * Excepción interna del sistema durante el proceso.
     */
    ERROR_INTERNO
}
