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
 * <p>Clase Java para RegistroRespuestaConsultaVentaBienesConsignaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroRespuestaConsultaVentaBienesConsignaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdRegistroDeclarado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IdRegistroDeclaradoType"/&gt;
 *         &lt;element name="DatosVentaBienesConsigna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaVentaBienesConsignaType"/&gt;
 *         &lt;element name="DatosPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DatosPresentacion2Type"/&gt;
 *         &lt;element name="EstadoVentaBienesConsigna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}EstadoFactura2Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroRespuestaConsultaVentaBienesConsignaType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "idRegistroDeclarado",
    "datosVentaBienesConsigna",
    "datosPresentacion",
    "estadoVentaBienesConsigna"
})
public class RegistroRespuestaConsultaVentaBienesConsignaType {

    @XmlElement(name = "IdRegistroDeclarado", required = true)
    protected IdRegistroDeclaradoType idRegistroDeclarado;
    @XmlElement(name = "DatosVentaBienesConsigna", required = true)
    protected RespuestaVentaBienesConsignaType datosVentaBienesConsigna;
    @XmlElement(name = "DatosPresentacion", required = true)
    protected DatosPresentacion2Type datosPresentacion;
    @XmlElement(name = "EstadoVentaBienesConsigna", required = true)
    protected EstadoFactura2Type estadoVentaBienesConsigna;

    /**
     * Obtiene el valor de la propiedad idRegistroDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link IdRegistroDeclaradoType }
     *     
     */
    public IdRegistroDeclaradoType getIdRegistroDeclarado() {
        return idRegistroDeclarado;
    }

    /**
     * Define el valor de la propiedad idRegistroDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link IdRegistroDeclaradoType }
     *     
     */
    public void setIdRegistroDeclarado(IdRegistroDeclaradoType value) {
        this.idRegistroDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad datosVentaBienesConsigna.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaVentaBienesConsignaType }
     *     
     */
    public RespuestaVentaBienesConsignaType getDatosVentaBienesConsigna() {
        return datosVentaBienesConsigna;
    }

    /**
     * Define el valor de la propiedad datosVentaBienesConsigna.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaVentaBienesConsignaType }
     *     
     */
    public void setDatosVentaBienesConsigna(RespuestaVentaBienesConsignaType value) {
        this.datosVentaBienesConsigna = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosPresentacion2Type }
     *     
     */
    public DatosPresentacion2Type getDatosPresentacion() {
        return datosPresentacion;
    }

    /**
     * Define el valor de la propiedad datosPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPresentacion2Type }
     *     
     */
    public void setDatosPresentacion(DatosPresentacion2Type value) {
        this.datosPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoVentaBienesConsigna.
     * 
     * @return
     *     possible object is
     *     {@link EstadoFactura2Type }
     *     
     */
    public EstadoFactura2Type getEstadoVentaBienesConsigna() {
        return estadoVentaBienesConsigna;
    }

    /**
     * Define el valor de la propiedad estadoVentaBienesConsigna.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoFactura2Type }
     *     
     */
    public void setEstadoVentaBienesConsigna(EstadoFactura2Type value) {
        this.estadoVentaBienesConsigna = value;
    }

}
