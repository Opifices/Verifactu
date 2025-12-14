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
 * <p>Clase Java para RegistroRespuestaConsultaFactInformadasClienteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroRespuestaConsultaFactInformadasClienteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaImputacionType"/&gt;
 *         &lt;element name="PeriodoLiquidacion"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Ejercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}YearType"/&gt;
 *                   &lt;element name="Periodo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoPeriodoType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DatosFacturaInformadaCliente" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}FacturaRespuestaInformadaClienteType"/&gt;
 *         &lt;element name="Cliente" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaUnicaESType"/&gt;
 *         &lt;element name="EstadoFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}EstadoFacturaImputacionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroRespuestaConsultaFactInformadasClienteType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "idFactura",
    "periodoLiquidacion",
    "datosFacturaInformadaCliente",
    "cliente",
    "estadoFactura"
})
public class RegistroRespuestaConsultaFactInformadasClienteType {

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaImputacionType idFactura;
    @XmlElement(name = "PeriodoLiquidacion", required = true)
    protected RegistroRespuestaConsultaFactInformadasClienteType.PeriodoLiquidacion periodoLiquidacion;
    @XmlElement(name = "DatosFacturaInformadaCliente", required = true)
    protected FacturaRespuestaInformadaClienteType datosFacturaInformadaCliente;
    @XmlElement(name = "Cliente", required = true)
    protected PersonaFisicaJuridicaUnicaESType cliente;
    @XmlElement(name = "EstadoFactura", required = true)
    protected EstadoFacturaImputacionType estadoFactura;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaImputacionType }
     *     
     */
    public IDFacturaImputacionType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaImputacionType }
     *     
     */
    public void setIDFactura(IDFacturaImputacionType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link RegistroRespuestaConsultaFactInformadasClienteType.PeriodoLiquidacion }
     *     
     */
    public RegistroRespuestaConsultaFactInformadasClienteType.PeriodoLiquidacion getPeriodoLiquidacion() {
        return periodoLiquidacion;
    }

    /**
     * Define el valor de la propiedad periodoLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroRespuestaConsultaFactInformadasClienteType.PeriodoLiquidacion }
     *     
     */
    public void setPeriodoLiquidacion(RegistroRespuestaConsultaFactInformadasClienteType.PeriodoLiquidacion value) {
        this.periodoLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFacturaInformadaCliente.
     * 
     * @return
     *     possible object is
     *     {@link FacturaRespuestaInformadaClienteType }
     *     
     */
    public FacturaRespuestaInformadaClienteType getDatosFacturaInformadaCliente() {
        return datosFacturaInformadaCliente;
    }

    /**
     * Define el valor de la propiedad datosFacturaInformadaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaRespuestaInformadaClienteType }
     *     
     */
    public void setDatosFacturaInformadaCliente(FacturaRespuestaInformadaClienteType value) {
        this.datosFacturaInformadaCliente = value;
    }

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
     * Obtiene el valor de la propiedad estadoFactura.
     * 
     * @return
     *     possible object is
     *     {@link EstadoFacturaImputacionType }
     *     
     */
    public EstadoFacturaImputacionType getEstadoFactura() {
        return estadoFactura;
    }

    /**
     * Define el valor de la propiedad estadoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoFacturaImputacionType }
     *     
     */
    public void setEstadoFactura(EstadoFacturaImputacionType value) {
        this.estadoFactura = value;
    }


    /**
     *  Período al que corresponden los apuntes 
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
     *         &lt;element name="Ejercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}YearType"/&gt;
     *         &lt;element name="Periodo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoPeriodoType"/&gt;
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
        "ejercicio",
        "periodo"
    })
    public static class PeriodoLiquidacion {

        @XmlElement(name = "Ejercicio", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", required = true)
        protected String ejercicio;
        @XmlElement(name = "Periodo", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", required = true)
        protected String periodo;

        /**
         * Obtiene el valor de la propiedad ejercicio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEjercicio() {
            return ejercicio;
        }

        /**
         * Define el valor de la propiedad ejercicio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEjercicio(String value) {
            this.ejercicio = value;
        }

        /**
         * Obtiene el valor de la propiedad periodo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodo() {
            return periodo;
        }

        /**
         * Define el valor de la propiedad periodo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodo(String value) {
            this.periodo = value;
        }

    }

}
