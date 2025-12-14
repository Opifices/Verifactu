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
 * Desglose cuando corresponda de la información asociada a los documentos de aduanas
 * 
 * <p>Clase Java para AduanasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AduanasType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroDUA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax40Type" minOccurs="0"/&gt;
 *         &lt;element name="FechaRegContableDUA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AduanasType", propOrder = {
    "numeroDUA",
    "fechaRegContableDUA"
})
public class AduanasType {

    @XmlElement(name = "NumeroDUA")
    protected String numeroDUA;
    @XmlElement(name = "FechaRegContableDUA")
    protected String fechaRegContableDUA;

    /**
     * Obtiene el valor de la propiedad numeroDUA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDUA() {
        return numeroDUA;
    }

    /**
     * Define el valor de la propiedad numeroDUA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDUA(String value) {
        this.numeroDUA = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegContableDUA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegContableDUA() {
        return fechaRegContableDUA;
    }

    /**
     * Define el valor de la propiedad fechaRegContableDUA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegContableDUA(String value) {
        this.fechaRegContableDUA = value;
    }

}
