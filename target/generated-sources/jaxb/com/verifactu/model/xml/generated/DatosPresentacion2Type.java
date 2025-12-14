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
 * <p>Clase Java para DatosPresentacion2Type complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosPresentacion2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NIFPresentador" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}NIFType"/&gt;
 *         &lt;element name="TimestampPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}Timestamp"/&gt;
 *         &lt;element name="CSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosPresentacion2Type", propOrder = {
    "nifPresentador",
    "timestampPresentacion",
    "csv"
})
public class DatosPresentacion2Type {

    @XmlElement(name = "NIFPresentador", required = true)
    protected String nifPresentador;
    @XmlElement(name = "TimestampPresentacion", required = true)
    protected String timestampPresentacion;
    @XmlElement(name = "CSV")
    protected String csv;

    /**
     * Obtiene el valor de la propiedad nifPresentador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFPresentador() {
        return nifPresentador;
    }

    /**
     * Define el valor de la propiedad nifPresentador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFPresentador(String value) {
        this.nifPresentador = value;
    }

    /**
     * Obtiene el valor de la propiedad timestampPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampPresentacion() {
        return timestampPresentacion;
    }

    /**
     * Define el valor de la propiedad timestampPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampPresentacion(String value) {
        this.timestampPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad csv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSV() {
        return csv;
    }

    /**
     * Define el valor de la propiedad csv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSV(String value) {
        this.csv = value;
    }

}
