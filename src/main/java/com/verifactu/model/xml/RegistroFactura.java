package com.verifactu.model.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class RegistroFactura {

    @XmlElement(name = "DatosFactura")
    private DatosFactura datosFactura;

    @XmlElement(name = "Trazabilidad")
    private Trazabilidad trazabilidad;
}
