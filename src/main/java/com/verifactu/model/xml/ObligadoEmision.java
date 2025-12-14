package com.verifactu.model.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class ObligadoEmision {

    @XmlElement(name = "NIF")
    private String nif;

    @XmlElement(name = "NombreRazon")
    private String nombreRazon;
}
