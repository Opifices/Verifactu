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
 *  Datos de Informacion adicional  
 * 
 * <p>Clase Java para RespuestaInfoAdicionalType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaInfoAdicionalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntregasIntracBienesServicios" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="ExportacionesYoperacAsimiladas" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperNoSujetasoISP" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperNoSujetasReglasLocalizExcepto123" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperSujetasISP" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperNoSujetasReglasLocalizOSS" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperSujetasOSS" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaInfoAdicionalType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "entregasIntracBienesServicios",
    "exportacionesYoperacAsimiladas",
    "operNoSujetasoISP",
    "operNoSujetasReglasLocalizExcepto123",
    "operSujetasISP",
    "operNoSujetasReglasLocalizOSS",
    "operSujetasOSS"
})
public class RespuestaInfoAdicionalType {

    @XmlElement(name = "EntregasIntracBienesServicios")
    protected String entregasIntracBienesServicios;
    @XmlElement(name = "ExportacionesYoperacAsimiladas")
    protected String exportacionesYoperacAsimiladas;
    @XmlElement(name = "OperNoSujetasoISP")
    protected String operNoSujetasoISP;
    @XmlElement(name = "OperNoSujetasReglasLocalizExcepto123")
    protected String operNoSujetasReglasLocalizExcepto123;
    @XmlElement(name = "OperSujetasISP")
    protected String operSujetasISP;
    @XmlElement(name = "OperNoSujetasReglasLocalizOSS")
    protected String operNoSujetasReglasLocalizOSS;
    @XmlElement(name = "OperSujetasOSS")
    protected String operSujetasOSS;

    /**
     * Obtiene el valor de la propiedad entregasIntracBienesServicios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregasIntracBienesServicios() {
        return entregasIntracBienesServicios;
    }

    /**
     * Define el valor de la propiedad entregasIntracBienesServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregasIntracBienesServicios(String value) {
        this.entregasIntracBienesServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacionesYoperacAsimiladas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportacionesYoperacAsimiladas() {
        return exportacionesYoperacAsimiladas;
    }

    /**
     * Define el valor de la propiedad exportacionesYoperacAsimiladas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportacionesYoperacAsimiladas(String value) {
        this.exportacionesYoperacAsimiladas = value;
    }

    /**
     * Obtiene el valor de la propiedad operNoSujetasoISP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperNoSujetasoISP() {
        return operNoSujetasoISP;
    }

    /**
     * Define el valor de la propiedad operNoSujetasoISP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperNoSujetasoISP(String value) {
        this.operNoSujetasoISP = value;
    }

    /**
     * Obtiene el valor de la propiedad operNoSujetasReglasLocalizExcepto123.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperNoSujetasReglasLocalizExcepto123() {
        return operNoSujetasReglasLocalizExcepto123;
    }

    /**
     * Define el valor de la propiedad operNoSujetasReglasLocalizExcepto123.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperNoSujetasReglasLocalizExcepto123(String value) {
        this.operNoSujetasReglasLocalizExcepto123 = value;
    }

    /**
     * Obtiene el valor de la propiedad operSujetasISP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperSujetasISP() {
        return operSujetasISP;
    }

    /**
     * Define el valor de la propiedad operSujetasISP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperSujetasISP(String value) {
        this.operSujetasISP = value;
    }

    /**
     * Obtiene el valor de la propiedad operNoSujetasReglasLocalizOSS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperNoSujetasReglasLocalizOSS() {
        return operNoSujetasReglasLocalizOSS;
    }

    /**
     * Define el valor de la propiedad operNoSujetasReglasLocalizOSS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperNoSujetasReglasLocalizOSS(String value) {
        this.operNoSujetasReglasLocalizOSS = value;
    }

    /**
     * Obtiene el valor de la propiedad operSujetasOSS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperSujetasOSS() {
        return operSujetasOSS;
    }

    /**
     * Define el valor de la propiedad operSujetasOSS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperSujetasOSS(String value) {
        this.operSujetasOSS = value;
    }

}
