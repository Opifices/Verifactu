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
 * <p>Clase Java para NoSujetaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NoSujetaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImportePorArticulos7_14_Otros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTAIReglasLocalizacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoSujetaType", propOrder = {
    "importePorArticulos714Otros",
    "importeTAIReglasLocalizacion"
})
public class NoSujetaType {

    @XmlElement(name = "ImportePorArticulos7_14_Otros")
    protected String importePorArticulos714Otros;
    @XmlElement(name = "ImporteTAIReglasLocalizacion")
    protected String importeTAIReglasLocalizacion;

    /**
     * Obtiene el valor de la propiedad importePorArticulos714Otros.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportePorArticulos714Otros() {
        return importePorArticulos714Otros;
    }

    /**
     * Define el valor de la propiedad importePorArticulos714Otros.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImportePorArticulos714Otros(String value) {
        this.importePorArticulos714Otros = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTAIReglasLocalizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTAIReglasLocalizacion() {
        return importeTAIReglasLocalizacion;
    }

    /**
     * Define el valor de la propiedad importeTAIReglasLocalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTAIReglasLocalizacion(String value) {
        this.importeTAIReglasLocalizacion = value;
    }

}
