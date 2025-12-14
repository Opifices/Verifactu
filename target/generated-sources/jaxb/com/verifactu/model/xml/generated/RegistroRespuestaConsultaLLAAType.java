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
 * <p>Clase Java para RegistroRespuestaConsultaLLAAType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroRespuestaConsultaLLAAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MensajeAviso" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax500Type" minOccurs="0"/&gt;
 *         &lt;element name="IvaDevengado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaIvaDevengadoType"/&gt;
 *         &lt;element name="IvaDeducible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaIvaDeducibleType"/&gt;
 *         &lt;element name="InfoAdicional" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaInfoAdicionalType"/&gt;
 *         &lt;element name="OperacionesEjercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaOperacionesEjercicioType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroRespuestaConsultaLLAAType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "mensajeAviso",
    "ivaDevengado",
    "ivaDeducible",
    "infoAdicional",
    "operacionesEjercicio"
})
public class RegistroRespuestaConsultaLLAAType {

    @XmlElement(name = "MensajeAviso")
    protected String mensajeAviso;
    @XmlElement(name = "IvaDevengado", required = true)
    protected RespuestaIvaDevengadoType ivaDevengado;
    @XmlElement(name = "IvaDeducible", required = true)
    protected RespuestaIvaDeducibleType ivaDeducible;
    @XmlElement(name = "InfoAdicional", required = true)
    protected RespuestaInfoAdicionalType infoAdicional;
    @XmlElement(name = "OperacionesEjercicio")
    protected RespuestaOperacionesEjercicioType operacionesEjercicio;

    /**
     * Obtiene el valor de la propiedad mensajeAviso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeAviso() {
        return mensajeAviso;
    }

    /**
     * Define el valor de la propiedad mensajeAviso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeAviso(String value) {
        this.mensajeAviso = value;
    }

    /**
     * Obtiene el valor de la propiedad ivaDevengado.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaIvaDevengadoType }
     *     
     */
    public RespuestaIvaDevengadoType getIvaDevengado() {
        return ivaDevengado;
    }

    /**
     * Define el valor de la propiedad ivaDevengado.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaIvaDevengadoType }
     *     
     */
    public void setIvaDevengado(RespuestaIvaDevengadoType value) {
        this.ivaDevengado = value;
    }

    /**
     * Obtiene el valor de la propiedad ivaDeducible.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaIvaDeducibleType }
     *     
     */
    public RespuestaIvaDeducibleType getIvaDeducible() {
        return ivaDeducible;
    }

    /**
     * Define el valor de la propiedad ivaDeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaIvaDeducibleType }
     *     
     */
    public void setIvaDeducible(RespuestaIvaDeducibleType value) {
        this.ivaDeducible = value;
    }

    /**
     * Obtiene el valor de la propiedad infoAdicional.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaInfoAdicionalType }
     *     
     */
    public RespuestaInfoAdicionalType getInfoAdicional() {
        return infoAdicional;
    }

    /**
     * Define el valor de la propiedad infoAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaInfoAdicionalType }
     *     
     */
    public void setInfoAdicional(RespuestaInfoAdicionalType value) {
        this.infoAdicional = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionesEjercicio.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaOperacionesEjercicioType }
     *     
     */
    public RespuestaOperacionesEjercicioType getOperacionesEjercicio() {
        return operacionesEjercicio;
    }

    /**
     * Define el valor de la propiedad operacionesEjercicio.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaOperacionesEjercicioType }
     *     
     */
    public void setOperacionesEjercicio(RespuestaOperacionesEjercicioType value) {
        this.operacionesEjercicio = value;
    }

}
