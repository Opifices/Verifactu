package com.verifactu.model.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class IDFactura {

    @XmlElement(name = "NumSerieFacturaEmisor")
    private String numSerieFacturaEmisor;

    @XmlElement(name = "NumSerieFacturaEmisorResumenFin")
    private String numSerieFacturaEmisorResumenFin; // Solo para recapitulativas

    @XmlElement(name = "FechaExpedicionFacturaEmisor")
    private String fechaExpedicionFacturaEmisor;
}
