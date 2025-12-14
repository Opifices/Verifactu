package com.verifactu.service.aeat;

import com.verifactu.persistence.entity.FacturaVerifactu;

/**
 * Interfaz para la comunicación con los Servicios Web de la AEAT.
 */
public interface AeatClientService {

    /**
     * Envía una factura firmada a la plataforma Verifactu de la AEAT.
     * <p>
     * Se usa Spring Retry para manejar fallos de red.
     * </p>
     * 
     * @param factura La entidad factura (en estado FIRMADA).
     * @return Verdadero si fue aceptada, falso en caso contrario o excepción.
     */
    boolean enviarFactura(FacturaVerifactu factura);
}
