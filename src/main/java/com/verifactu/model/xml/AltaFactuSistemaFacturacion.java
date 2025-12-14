package com.verifactu.model.xml;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

/**
 * Representa el bloque raíz <RegFactuSistemaFacturacion> o similar según
 * estructura AEAT.
 * NOTA: Esto es una simplificación manual de la estructura oficial.
 * En un entorno real con acceso a internet, se generaría desde el XSD.
 */
@XmlRootElement(name = "AltaFactuSistemaFacturacion")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class AltaFactuSistemaFacturacion {

    @XmlElement(name = "Cabecera")
    private Cabecera cabecera;

    @XmlElement(name = "RegistroFactura")
    private RegistroFactura registroFactura;
}
