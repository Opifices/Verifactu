//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.12.14 a las 07:07:24 PM CET 
//


package com.verifactu.model.xml.generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Respuesta a un envío 
 * 
 * <p>Clase Java para RespuestaExpedidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaExpedidaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaExpedidaType"/&gt;
 *         &lt;element name="Operacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoOperacionType"/&gt;
 *         &lt;element name="RefExterna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="EstadoRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd}EstadoRegistroType"/&gt;
 *         &lt;element name="CodigoErrorRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd}ErrorDetalleType" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionErrorRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax1500Type" minOccurs="0"/&gt;
 *         &lt;element name="RegistroDuplicado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroDuplicadoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaExpedidaType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd", propOrder = {
    "idFactura",
    "operacion",
    "refExterna",
    "estadoRegistro",
    "codigoErrorRegistro",
    "descripcionErrorRegistro",
    "registroDuplicado"
})
public class RespuestaExpedidaType {

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaExpedidaType idFactura;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "RefExterna")
    protected String refExterna;
    @XmlElement(name = "EstadoRegistro", required = true)
    @XmlSchemaType(name = "string")
    protected EstadoRegistroType estadoRegistro;
    @XmlElement(name = "CodigoErrorRegistro")
    protected BigInteger codigoErrorRegistro;
    @XmlElement(name = "DescripcionErrorRegistro")
    protected String descripcionErrorRegistro;
    @XmlElement(name = "RegistroDuplicado")
    protected RegistroDuplicadoType registroDuplicado;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public IDFacturaExpedidaType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public void setIDFactura(IDFacturaExpedidaType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacion(String value) {
        this.operacion = value;
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
     * Obtiene el valor de la propiedad estadoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link EstadoRegistroType }
     *     
     */
    public EstadoRegistroType getEstadoRegistro() {
        return estadoRegistro;
    }

    /**
     * Define el valor de la propiedad estadoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoRegistroType }
     *     
     */
    public void setEstadoRegistro(EstadoRegistroType value) {
        this.estadoRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoErrorRegistro.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoErrorRegistro() {
        return codigoErrorRegistro;
    }

    /**
     * Define el valor de la propiedad codigoErrorRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoErrorRegistro(BigInteger value) {
        this.codigoErrorRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionErrorRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionErrorRegistro() {
        return descripcionErrorRegistro;
    }

    /**
     * Define el valor de la propiedad descripcionErrorRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionErrorRegistro(String value) {
        this.descripcionErrorRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad registroDuplicado.
     * 
     * @return
     *     possible object is
     *     {@link RegistroDuplicadoType }
     *     
     */
    public RegistroDuplicadoType getRegistroDuplicado() {
        return registroDuplicado;
    }

    /**
     * Define el valor de la propiedad registroDuplicado.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroDuplicadoType }
     *     
     */
    public void setRegistroDuplicado(RegistroDuplicadoType value) {
        this.registroDuplicado = value;
    }

}
