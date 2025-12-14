package com.verifactu.model.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class DatosFactura {

    @XmlElement(name = "IDFactura")
    private IDFactura idFactura;

    @XmlElement(name = "ImporteTotal")
    private String importeTotal;

    @XmlElement(name = "Descripcion")
    private String descripcion;
}
