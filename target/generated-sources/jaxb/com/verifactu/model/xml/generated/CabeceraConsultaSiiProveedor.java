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
 *  Datos de contexto de un suministro sin especificar el tipo de comunicacion 
 * 
 * <p>Clase Java para CabeceraConsultaSiiProveedor complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CabeceraConsultaSiiProveedor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDVersionSii" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}VersionSiiType"/&gt;
 *         &lt;element name="TitularLRFR" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaUnicaESType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabeceraConsultaSiiProveedor", propOrder = {
    "idVersionSii",
    "titularLRFR"
})
public class CabeceraConsultaSiiProveedor {

    @XmlElement(name = "IDVersionSii", required = true)
    protected String idVersionSii;
    @XmlElement(name = "TitularLRFR", required = true)
    protected PersonaFisicaJuridicaUnicaESType titularLRFR;

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
     * Obtiene el valor de la propiedad titularLRFR.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public PersonaFisicaJuridicaUnicaESType getTitularLRFR() {
        return titularLRFR;
    }

    /**
     * Define el valor de la propiedad titularLRFR.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public void setTitularLRFR(PersonaFisicaJuridicaUnicaESType value) {
        this.titularLRFR = value;
    }

}
