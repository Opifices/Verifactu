//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.12.14 a las 07:07:24 PM CET 
//


package com.verifactu.model.xml.generated;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrazabilidadType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrazabilidadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Huella" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HuellaAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrazabilidadType", propOrder = {
    "huella",
    "huellaAnterior"
})
public class TrazabilidadType {

    @XmlElement(name = "Huella", required = true)
    protected String huella;
    @XmlElement(name = "HuellaAnterior")
    protected String huellaAnterior;

    /**
     * Obtiene el valor de la propiedad huella.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuella() {
        return huella;
    }

    /**
     * Define el valor de la propiedad huella.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuella(String value) {
        this.huella = value;
    }

    /**
     * Obtiene el valor de la propiedad huellaAnterior.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHuellaAnterior() {
        return huellaAnterior;
    }

    /**
     * Define el valor de la propiedad huellaAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHuellaAnterior(String value) {
        this.huellaAnterior = value;
    }

}
