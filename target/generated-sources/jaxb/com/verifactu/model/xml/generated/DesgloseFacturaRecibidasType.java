//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.12.14 a las 07:07:24 PM CET 
//


package com.verifactu.model.xml.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DesgloseFacturaRecibidasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DesgloseFacturaRecibidasType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InversionSujetoPasivo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVARecibida2Type" maxOccurs="12"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DesgloseIVA" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVARecibidaType" maxOccurs="12"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesgloseFacturaRecibidasType", propOrder = {
    "inversionSujetoPasivo",
    "desgloseIVA"
})
public class DesgloseFacturaRecibidasType {

    @XmlElement(name = "InversionSujetoPasivo")
    protected DesgloseFacturaRecibidasType.InversionSujetoPasivo inversionSujetoPasivo;
    @XmlElement(name = "DesgloseIVA")
    protected DesgloseFacturaRecibidasType.DesgloseIVA desgloseIVA;

    /**
     * Obtiene el valor de la propiedad inversionSujetoPasivo.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseFacturaRecibidasType.InversionSujetoPasivo }
     *     
     */
    public DesgloseFacturaRecibidasType.InversionSujetoPasivo getInversionSujetoPasivo() {
        return inversionSujetoPasivo;
    }

    /**
     * Define el valor de la propiedad inversionSujetoPasivo.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseFacturaRecibidasType.InversionSujetoPasivo }
     *     
     */
    public void setInversionSujetoPasivo(DesgloseFacturaRecibidasType.InversionSujetoPasivo value) {
        this.inversionSujetoPasivo = value;
    }

    /**
     * Obtiene el valor de la propiedad desgloseIVA.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseFacturaRecibidasType.DesgloseIVA }
     *     
     */
    public DesgloseFacturaRecibidasType.DesgloseIVA getDesgloseIVA() {
        return desgloseIVA;
    }

    /**
     * Define el valor de la propiedad desgloseIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseFacturaRecibidasType.DesgloseIVA }
     *     
     */
    public void setDesgloseIVA(DesgloseFacturaRecibidasType.DesgloseIVA value) {
        this.desgloseIVA = value;
    }


    /**
     * Desglose por tipos de iva
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVARecibidaType" maxOccurs="12"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detalleIVA"
    })
    public static class DesgloseIVA {

        @XmlElement(name = "DetalleIVA", required = true)
        protected List<DetalleIVARecibidaType> detalleIVA;

        /**
         * Gets the value of the detalleIVA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the detalleIVA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalleIVA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DetalleIVARecibidaType }
         * 
         * 
         */
        public List<DetalleIVARecibidaType> getDetalleIVA() {
            if (detalleIVA == null) {
                detalleIVA = new ArrayList<DetalleIVARecibidaType>();
            }
            return this.detalleIVA;
        }

    }


    /**
     * Desglose por tipos de iva
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVARecibida2Type" maxOccurs="12"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detalleIVA"
    })
    public static class InversionSujetoPasivo {

        @XmlElement(name = "DetalleIVA", required = true)
        protected List<DetalleIVARecibida2Type> detalleIVA;

        /**
         * Gets the value of the detalleIVA property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the detalleIVA property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalleIVA().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DetalleIVARecibida2Type }
         * 
         * 
         */
        public List<DetalleIVARecibida2Type> getDetalleIVA() {
            if (detalleIVA == null) {
                detalleIVA = new ArrayList<DetalleIVARecibida2Type>();
            }
            return this.detalleIVA;
        }

    }

}
