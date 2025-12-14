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
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Datos de contexto de un suministro 
 * 
 * <p>Clase Java para CabeceraSii complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CabeceraSii"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDVersionSii" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}VersionSiiType"/&gt;
 *         &lt;element name="Titular" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaESType"/&gt;
 *         &lt;element name="TipoComunicacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ClaveTipoComunicacionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabeceraSii", propOrder = {
    "idVersionSii",
    "titular",
    "tipoComunicacion"
})
public class CabeceraSii {

    @XmlElement(name = "IDVersionSii", required = true)
    protected String idVersionSii;
    @XmlElement(name = "Titular", required = true)
    protected PersonaFisicaJuridicaESType titular;
    @XmlElement(name = "TipoComunicacion", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveTipoComunicacionType tipoComunicacion;

    /**
     * Obtiene el valor de la propiedad idVersionSii.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDVersionSii() {
        return idVersionSii;
    }

    /**
     * Define el valor de la propiedad idVersionSii.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDVersionSii(String value) {
        this.idVersionSii = value;
    }

    /**
     * Obtiene el valor de la propiedad titular.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public PersonaFisicaJuridicaESType getTitular() {
        return titular;
    }

    /**
     * Define el valor de la propiedad titular.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaESType }
     *     
     */
    public void setTitular(PersonaFisicaJuridicaESType value) {
        this.titular = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoComunicacion.
     * 
     * @return
     *     possible object is
     *     {@link ClaveTipoComunicacionType }
     *     
     */
    public ClaveTipoComunicacionType getTipoComunicacion() {
        return tipoComunicacion;
    }

    /**
     * Define el valor de la propiedad tipoComunicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveTipoComunicacionType }
     *     
     */
    public void setTipoComunicacion(ClaveTipoComunicacionType value) {
        this.tipoComunicacion = value;
    }

}
