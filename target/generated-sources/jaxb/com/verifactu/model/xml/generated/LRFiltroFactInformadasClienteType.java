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
 * <p>Clase Java para LRFiltroFactInformadasClienteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRFiltroFactInformadasClienteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroSiiImputacion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cliente" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaUnicaESType" minOccurs="0"/&gt;
 *         &lt;element name="NumSerieFacturaEmisor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextoIDFacturaType" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCuadre" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}EstadoCuadreImputacionType" minOccurs="0"/&gt;
 *         &lt;element name="FechaExpedicion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RangoFechaType" minOccurs="0"/&gt;
 *         &lt;element name="FechaOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RangoFechaType" minOccurs="0"/&gt;
 *         &lt;element name="ClavePaginacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ClavePaginacionClienteType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRFiltroFactInformadasClienteType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd", propOrder = {
    "cliente",
    "numSerieFacturaEmisor",
    "estadoCuadre",
    "fechaExpedicion",
    "fechaOperacion",
    "clavePaginacion"
})
public class LRFiltroFactInformadasClienteType
    extends RegistroSiiImputacion
{

    @XmlElement(name = "Cliente")
    protected PersonaFisicaJuridicaUnicaESType cliente;
    @XmlElement(name = "NumSerieFacturaEmisor")
    protected String numSerieFacturaEmisor;
    @XmlElement(name = "EstadoCuadre")
    protected String estadoCuadre;
    @XmlElement(name = "FechaExpedicion")
    protected RangoFechaType fechaExpedicion;
    @XmlElement(name = "FechaOperacion")
    protected RangoFechaType fechaOperacion;
    @XmlElement(name = "ClavePaginacion")
    protected ClavePaginacionClienteType clavePaginacion;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public PersonaFisicaJuridicaUnicaESType getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public void setCliente(PersonaFisicaJuridicaUnicaESType value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad numSerieFacturaEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerieFacturaEmisor() {
        return numSerieFacturaEmisor;
    }

    /**
     * Define el valor de la propiedad numSerieFacturaEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerieFacturaEmisor(String value) {
        this.numSerieFacturaEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCuadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCuadre() {
        return estadoCuadre;
    }

    /**
     * Define el valor de la propiedad estadoCuadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCuadre(String value) {
        this.estadoCuadre = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicion.
     * 
     * @return
     *     possible object is
     *     {@link RangoFechaType }
     *     
     */
    public RangoFechaType getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Define el valor de la propiedad fechaExpedicion.
     * 
     * @param value
     *     allowed object is
     *     {@link RangoFechaType }
     *     
     */
    public void setFechaExpedicion(RangoFechaType value) {
        this.fechaExpedicion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link RangoFechaType }
     *     
     */
    public RangoFechaType getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RangoFechaType }
     *     
     */
    public void setFechaOperacion(RangoFechaType value) {
        this.fechaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePaginacion.
     * 
     * @return
     *     possible object is
     *     {@link ClavePaginacionClienteType }
     *     
     */
    public ClavePaginacionClienteType getClavePaginacion() {
        return clavePaginacion;
    }

    /**
     * Define el valor de la propiedad clavePaginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ClavePaginacionClienteType }
     *     
     */
    public void setClavePaginacion(ClavePaginacionClienteType value) {
        this.clavePaginacion = value;
    }

}
