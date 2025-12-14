package com.verifactu.exception;

/**
 * Excepción crítica lanzada cuando se detecta una ruptura en la cadena de
 * facturación.
 * <p>
 * Esto indica una posible manipulación de la base de datos o un error grave de
 * consistencia.
 * El sistema DEBE detener la facturación.
 * </p>
 */
public class IntegrityViolationException extends RuntimeException {
    public IntegrityViolationException(String message) {
        super(message);
    }
}
