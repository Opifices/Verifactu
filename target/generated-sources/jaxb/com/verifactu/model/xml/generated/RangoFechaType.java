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
 * Rango de fechas 
 * 
 * <p>Clase Java para RangoFechaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RangoFechaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Desde" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *         &lt;element name="Hasta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangoFechaType", propOrder = {
    "desde",
    "hasta"
})
public class RangoFechaType {

    @XmlElement(name = "Desde")
    protected String desde;
    @XmlElement(name = "Hasta")
    protected String hasta;

    /**
     * Obtiene el valor de la propiedad desde.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesde() {
        return desde;
    }

    /**
     * Define el valor de la propiedad desde.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesde(String value) {
        this.desde = value;
    }

    /**
     * Obtiene el valor de la propiedad hasta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasta() {
        return hasta;
    }

    /**
     * Define el valor de la propiedad hasta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasta(String value) {
        this.hasta = value;
    }

}
