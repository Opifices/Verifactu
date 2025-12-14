package com.verifactu.model.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Trazabilidad {

    @XmlElement(name = "Huella")
    private String huella;

    @XmlElement(name = "HuellaAnterior")
    private String huellaAnterior; // Puede ser null
}
