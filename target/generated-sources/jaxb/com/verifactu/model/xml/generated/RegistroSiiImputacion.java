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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Información básica que contienen los registros de imputacion 
 * 
 * <p>Clase Java para RegistroSiiImputacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroSiiImputacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PeriodoImputacion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EjercicioImputacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}YearType"/&gt;
 *                   &lt;element name="PeriodoImputacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoPeriodoType"/&gt;
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
@XmlType(name = "RegistroSiiImputacion", propOrder = {
    "periodoImputacion"
})
@XmlSeeAlso({
    LRFiltroFactInformadasClienteType.class,
    LRFiltroFactInformadasAgrupadasClienteType.class,
    LRFiltroFactInformadasProveedorType.class,
    LRFiltroFactInformadasAgrupadasProveedorType.class
})
public class RegistroSiiImputacion {

    @XmlElement(name = "PeriodoImputacion", required = true)
    protected RegistroSiiImputacion.PeriodoImputacion periodoImputacion;

    /**
     * Obtiene el valor de la propiedad periodoImputacion.
     * 
     * @return
     *     possible object is
     *     {@link RegistroSiiImputacion.PeriodoImputacion }
     *     
     */
    public RegistroSiiImputacion.PeriodoImputacion getPeriodoImputacion() {
        return periodoImputacion;
    }

    /**
     * Define el valor de la propiedad periodoImputacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroSiiImputacion.PeriodoImputacion }
     *     
     */
    public void setPeriodoImputacion(RegistroSiiImputacion.PeriodoImputacion value) {
        this.periodoImputacion = value;
    }


    /**
     *  Período de imputacion de la factura 
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
     *         &lt;element name="EjercicioImputacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}YearType"/&gt;
     *         &lt;element name="PeriodoImputacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoPeriodoType"/&gt;
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
        "ejercicioImputacion",
        "periodoImputacion"
    })
    public static class PeriodoImputacion {

        @XmlElement(name = "EjercicioImputacion", required = true)
        protected String ejercicioImputacion;
        @XmlElement(name = "PeriodoImputacion", required = true)
        protected String periodoImputacion;

        /**
         * Obtiene el valor de la propiedad ejercicioImputacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEjercicioImputacion() {
            return ejercicioImputacion;
        }

        /**
         * Define el valor de la propiedad ejercicioImputacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEjercicioImputacion(String value) {
            this.ejercicioImputacion = value;
        }

        /**
         * Obtiene el valor de la propiedad periodoImputacion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodoImputacion() {
            return periodoImputacion;
        }

        /**
         * Define el valor de la propiedad periodoImputacion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodoImputacion(String value) {
            this.periodoImputacion = value;
        }

    }

}
