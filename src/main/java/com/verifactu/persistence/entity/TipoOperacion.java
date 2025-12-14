package com.verifactu.persistence.entity;

/**
 * Define el tipo de operación de registro según normativa Verifactu.
 */
public enum TipoOperacion {
    /**
     * Alta de factura.
     */
    ALTA,

    /**
     * Anulación de factura (o baja).
     */
    ANULACION,

    /**
     * Evento de inicio del sistema de facturación.
     */
    INICIO_SISTEMA,

    /**
     * Evento de parada del sistema (por error o mantenimiento).
     */
    FIN_SISTEMA,

    /**
     * Factura subsanada (rectificación por error informático).
     */
    SUBSANACION
}
