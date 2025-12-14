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
 * <p>Clase Java para DestinoFinalExpedRecepType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DestinoFinalExpedRecepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescripBienes" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax120Type"/&gt;
 *         &lt;element name="Cantidad" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax120Type"/&gt;
 *         &lt;element name="FechaOpDeclarada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha"/&gt;
 *         &lt;element name="DestinatarioFinal" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponibleValor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
 *         &lt;element name="PrecioUnitario" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinoFinalExpedRecepType", propOrder = {
    "descripBienes",
    "cantidad",
    "fechaOpDeclarada",
    "destinatarioFinal",
    "baseImponibleValor",
    "precioUnitario"
})
public class DestinoFinalExpedRecepType {

    @XmlElement(name = "DescripBienes", required = true)
    protected String descripBienes;
    @XmlElement(name = "Cantidad", required = true)
    protected String cantidad;
    @XmlElement(name = "FechaOpDeclarada", required = true)
    protected String fechaOpDeclarada;
    @XmlElement(name = "DestinatarioFinal")
    protected PersonaFisicaJuridicaType destinatarioFinal;
    @XmlElement(name = "BaseImponibleValor", required = true)
    protected String baseImponibleValor;
    @XmlElement(name = "PrecioUnitario")
    protected String precioUnitario;

    /**
     * Obtiene el valor de la propiedad descripBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripBienes() {
        return descripBienes;
    }

    /**
     * Define el valor de la propiedad descripBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripBienes(String value) {
        this.descripBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantidad(String value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOpDeclarada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOpDeclarada() {
        return fechaOpDeclarada;
    }

    /**
     * Define el valor de la propiedad fechaOpDeclarada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOpDeclarada(String value) {
        this.fechaOpDeclarada = value;
    }

    /**
     * Obtiene el valor de la propiedad destinatarioFinal.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getDestinatarioFinal() {
        return destinatarioFinal;
    }

    /**
     * Define el valor de la propiedad destinatarioFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setDestinatarioFinal(PersonaFisicaJuridicaType value) {
        this.destinatarioFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleValor() {
        return baseImponibleValor;
    }

    /**
     * Define el valor de la propiedad baseImponibleValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleValor(String value) {
        this.baseImponibleValor = value;
    }

    /**
     * Obtiene el valor de la propiedad precioUnitario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Define el valor de la propiedad precioUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecioUnitario(String value) {
        this.precioUnitario = value;
    }

}
