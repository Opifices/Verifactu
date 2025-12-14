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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tipo de Operacion Sujeta
 * 
 * <p>Clase Java para SujetaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SujetaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exenta" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DetalleExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleExentaType" maxOccurs="7"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NoExenta" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoNoExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoOperacionSujetaNoExentaType"/&gt;
 *                   &lt;element name="DesgloseIVA"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVAEmitidaType" maxOccurs="12"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "SujetaType", propOrder = {
    "exenta",
    "noExenta"
})
public class SujetaType {

    @XmlElement(name = "Exenta")
    protected SujetaType.Exenta exenta;
    @XmlElement(name = "NoExenta")
    protected SujetaType.NoExenta noExenta;

    /**
     * Obtiene el valor de la propiedad exenta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaType.Exenta }
     *     
     */
    public SujetaType.Exenta getExenta() {
        return exenta;
    }

    /**
     * Define el valor de la propiedad exenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaType.Exenta }
     *     
     */
    public void setExenta(SujetaType.Exenta value) {
        this.exenta = value;
    }

    /**
     * Obtiene el valor de la propiedad noExenta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaType.NoExenta }
     *     
     */
    public SujetaType.NoExenta getNoExenta() {
        return noExenta;
    }

    /**
     * Define el valor de la propiedad noExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaType.NoExenta }
     *     
     */
    public void setNoExenta(SujetaType.NoExenta value) {
        this.noExenta = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DetalleExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleExentaType" maxOccurs="7"/&gt;
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
        "detalleExenta"
    })
    public static class Exenta {

        @XmlElement(name = "DetalleExenta", required = true)
        protected List<DetalleExentaType> detalleExenta;

        /**
         * Gets the value of the detalleExenta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the detalleExenta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalleExenta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DetalleExentaType }
         * 
         * 
         */
        public List<DetalleExentaType> getDetalleExenta() {
            if (detalleExenta == null) {
                detalleExenta = new ArrayList<DetalleExentaType>();
            }
            return this.detalleExenta;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TipoNoExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoOperacionSujetaNoExentaType"/&gt;
     *         &lt;element name="DesgloseIVA"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVAEmitidaType" maxOccurs="12"/&gt;
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
    @XmlType(name = "", propOrder = {
        "tipoNoExenta",
        "desgloseIVA"
    })
    public static class NoExenta {

        @XmlElement(name = "TipoNoExenta", required = true)
        @XmlSchemaType(name = "string")
        protected TipoOperacionSujetaNoExentaType tipoNoExenta;
        @XmlElement(name = "DesgloseIVA", required = true)
        protected SujetaType.NoExenta.DesgloseIVA desgloseIVA;

        /**
         * Obtiene el valor de la propiedad tipoNoExenta.
         * 
         * @return
         *     possible object is
         *     {@link TipoOperacionSujetaNoExentaType }
         *     
         */
        public TipoOperacionSujetaNoExentaType getTipoNoExenta() {
            return tipoNoExenta;
        }

        /**
         * Define el valor de la propiedad tipoNoExenta.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoOperacionSujetaNoExentaType }
         *     
         */
        public void setTipoNoExenta(TipoOperacionSujetaNoExentaType value) {
            this.tipoNoExenta = value;
        }

        /**
         * Obtiene el valor de la propiedad desgloseIVA.
         * 
         * @return
         *     possible object is
         *     {@link SujetaType.NoExenta.DesgloseIVA }
         *     
         */
        public SujetaType.NoExenta.DesgloseIVA getDesgloseIVA() {
            return desgloseIVA;
        }

        /**
         * Define el valor de la propiedad desgloseIVA.
         * 
         * @param value
         *     allowed object is
         *     {@link SujetaType.NoExenta.DesgloseIVA }
         *     
         */
        public void setDesgloseIVA(SujetaType.NoExenta.DesgloseIVA value) {
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
         *         &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DetalleIVAEmitidaType" maxOccurs="12"/&gt;
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
            protected List<DetalleIVAEmitidaType> detalleIVA;

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
             * {@link DetalleIVAEmitidaType }
             * 
             * 
             */
            public List<DetalleIVAEmitidaType> getDetalleIVA() {
                if (detalleIVA == null) {
                    detalleIVA = new ArrayList<DetalleIVAEmitidaType>();
                }
                return this.detalleIVA;
            }

        }

    }

}
