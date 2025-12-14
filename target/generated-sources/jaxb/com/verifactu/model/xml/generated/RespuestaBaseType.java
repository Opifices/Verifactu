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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaBaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DatosPresentacionType" minOccurs="0"/&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CabeceraType"/&gt;
 *         &lt;element name="TiempoEsperaEnvio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}Tipo6Type"/&gt;
 *         &lt;element name="EstadoEnvio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd}EstadoEnvioType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaBaseType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd", propOrder = {
    "csv",
    "datosPresentacion",
    "cabecera",
    "tiempoEsperaEnvio",
    "estadoEnvio"
})
@XmlSeeAlso({
    RespuestaRegFactuSistemaFacturacionType.class
})
public class RespuestaBaseType {

    @XmlElement(name = "CSV")
    protected String csv;
    @XmlElement(name = "DatosPresentacion")
    protected DatosPresentacionType datosPresentacion;
    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraType cabecera;
    @XmlElement(name = "TiempoEsperaEnvio", required = true)
    protected String tiempoEsperaEnvio;
    @XmlElement(name = "EstadoEnvio", required = true)
    @XmlSchemaType(name = "string")
    protected EstadoEnvioType estadoEnvio;

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

    /**
     * Obtiene el valor de la propiedad datosPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosPresentacionType }
     *     
     */
    public DatosPresentacionType getDatosPresentacion() {
        return datosPresentacion;
    }

    /**
     * Define el valor de la propiedad datosPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPresentacionType }
     *     
     */
    public void setDatosPresentacion(DatosPresentacionType value) {
        this.datosPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraType }
     *     
     */
    public CabeceraType getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraType }
     *     
     */
    public void setCabecera(CabeceraType value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoEsperaEnvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoEsperaEnvio() {
        return tiempoEsperaEnvio;
    }

    /**
     * Define el valor de la propiedad tiempoEsperaEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoEsperaEnvio(String value) {
        this.tiempoEsperaEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoEnvio.
     * 
     * @return
     *     possible object is
     *     {@link EstadoEnvioType }
     *     
     */
    public EstadoEnvioType getEstadoEnvio() {
        return estadoEnvio;
    }

    /**
     * Define el valor de la propiedad estadoEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoEnvioType }
     *     
     */
    public void setEstadoEnvio(EstadoEnvioType value) {
        this.estadoEnvio = value;
    }

}
