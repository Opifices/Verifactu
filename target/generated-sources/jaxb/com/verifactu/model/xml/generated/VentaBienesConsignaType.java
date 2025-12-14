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
 *  Apunte correspondiente al libro de registro de ventas de bienes en consigna . 
 * 
 * <p>Clase Java para VentaBienesConsignaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VentaBienesConsignaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InfoExpedicionRecepcion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}InfoExpedicionRecepcionType" minOccurs="0"/&gt;
 *         &lt;element name="IdRegistroExpInicial" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IdRegistroExpInicialType" minOccurs="0"/&gt;
 *         &lt;element name="DestinoFinalExpedRecep" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DestinoFinalExpedRecepType" minOccurs="0"/&gt;
 *         &lt;element name="RefExterna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="NumRegistroAcuerdoFacturacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax15Type" minOccurs="0"/&gt;
 *         &lt;element name="EntidadSucedida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaUnicaESType" minOccurs="0"/&gt;
 *         &lt;element name="RegPrevioGGEEoREDEMEoCompetencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegPrevioGGEEoREDEMEoCompetenciaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VentaBienesConsignaType", propOrder = {
    "infoExpedicionRecepcion",
    "idRegistroExpInicial",
    "destinoFinalExpedRecep",
    "refExterna",
    "numRegistroAcuerdoFacturacion",
    "entidadSucedida",
    "regPrevioGGEEoREDEMEoCompetencia"
})
public class VentaBienesConsignaType {

    @XmlElement(name = "InfoExpedicionRecepcion")
    protected InfoExpedicionRecepcionType infoExpedicionRecepcion;
    @XmlElement(name = "IdRegistroExpInicial")
    protected IdRegistroExpInicialType idRegistroExpInicial;
    @XmlElement(name = "DestinoFinalExpedRecep")
    protected DestinoFinalExpedRecepType destinoFinalExpedRecep;
    @XmlElement(name = "RefExterna")
    protected String refExterna;
    @XmlElement(name = "NumRegistroAcuerdoFacturacion")
    protected String numRegistroAcuerdoFacturacion;
    @XmlElement(name = "EntidadSucedida")
    protected PersonaFisicaJuridicaUnicaESType entidadSucedida;
    @XmlElement(name = "RegPrevioGGEEoREDEMEoCompetencia")
    @XmlSchemaType(name = "string")
    protected RegPrevioGGEEoREDEMEoCompetenciaType regPrevioGGEEoREDEMEoCompetencia;

    /**
     * Obtiene el valor de la propiedad infoExpedicionRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link InfoExpedicionRecepcionType }
     *     
     */
    public InfoExpedicionRecepcionType getInfoExpedicionRecepcion() {
        return infoExpedicionRecepcion;
    }

    /**
     * Define el valor de la propiedad infoExpedicionRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoExpedicionRecepcionType }
     *     
     */
    public void setInfoExpedicionRecepcion(InfoExpedicionRecepcionType value) {
        this.infoExpedicionRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegistroExpInicial.
     * 
     * @return
     *     possible object is
     *     {@link IdRegistroExpInicialType }
     *     
     */
    public IdRegistroExpInicialType getIdRegistroExpInicial() {
        return idRegistroExpInicial;
    }

    /**
     * Define el valor de la propiedad idRegistroExpInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRegistroExpInicialType }
     *     
     */
    public void setIdRegistroExpInicial(IdRegistroExpInicialType value) {
        this.idRegistroExpInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoFinalExpedRecep.
     * 
     * @return
     *     possible object is
     *     {@link DestinoFinalExpedRecepType }
     *     
     */
    public DestinoFinalExpedRecepType getDestinoFinalExpedRecep() {
        return destinoFinalExpedRecep;
    }

    /**
     * Define el valor de la propiedad destinoFinalExpedRecep.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinoFinalExpedRecepType }
     *     
     */
    public void setDestinoFinalExpedRecep(DestinoFinalExpedRecepType value) {
        this.destinoFinalExpedRecep = value;
    }

    /**
     * Obtiene el valor de la propiedad refExterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefExterna() {
        return refExterna;
    }

    /**
     * Define el valor de la propiedad refExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefExterna(String value) {
        this.refExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistroAcuerdoFacturacion() {
        return numRegistroAcuerdoFacturacion;
    }

    /**
     * Define el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistroAcuerdoFacturacion(String value) {
        this.numRegistroAcuerdoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadSucedida.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public PersonaFisicaJuridicaUnicaESType getEntidadSucedida() {
        return entidadSucedida;
    }

    /**
     * Define el valor de la propiedad entidadSucedida.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public void setEntidadSucedida(PersonaFisicaJuridicaUnicaESType value) {
        this.entidadSucedida = value;
    }

    /**
     * Obtiene el valor de la propiedad regPrevioGGEEoREDEMEoCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link RegPrevioGGEEoREDEMEoCompetenciaType }
     *     
     */
    public RegPrevioGGEEoREDEMEoCompetenciaType getRegPrevioGGEEoREDEMEoCompetencia() {
        return regPrevioGGEEoREDEMEoCompetencia;
    }

    /**
     * Define el valor de la propiedad regPrevioGGEEoREDEMEoCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPrevioGGEEoREDEMEoCompetenciaType }
     *     
     */
    public void setRegPrevioGGEEoREDEMEoCompetencia(RegPrevioGGEEoREDEMEoCompetenciaType value) {
        this.regPrevioGGEEoREDEMEoCompetencia = value;
    }

}
