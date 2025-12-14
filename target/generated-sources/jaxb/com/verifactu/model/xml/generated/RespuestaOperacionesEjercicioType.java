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
 *  Datos de operaciones realizadas en el ejercicio  
 * 
 * <p>Clase Java para RespuestaOperacionesEjercicioType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaOperacionesEjercicioType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpRegimenGeneral" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="EntregasIntraExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="ExportacYotrasOperacExentasConDerechoDeducc" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OpExentaSinDeducir" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OpNoSujetaReglasLocalizac" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperSujetasISP" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperNoSujetasReglasLocalizOSS" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperSujetasOSS" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperREBU" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="OperREAV" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *         &lt;element name="TotalVolOperac" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn16.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaOperacionesEjercicioType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "opRegimenGeneral",
    "entregasIntraExenta",
    "exportacYotrasOperacExentasConDerechoDeducc",
    "opExentaSinDeducir",
    "opNoSujetaReglasLocalizac",
    "operSujetasISP",
    "operNoSujetasReglasLocalizOSS",
    "operSujetasOSS",
    "operREBU",
    "operREAV",
    "totalVolOperac"
})
public class RespuestaOperacionesEjercicioType {

    @XmlElement(name = "OpRegimenGeneral")
    protected String opRegimenGeneral;
    @XmlElement(name = "EntregasIntraExenta")
    protected String entregasIntraExenta;
    @XmlElement(name = "ExportacYotrasOperacExentasConDerechoDeducc")
    protected String exportacYotrasOperacExentasConDerechoDeducc;
    @XmlElement(name = "OpExentaSinDeducir")
    protected String opExentaSinDeducir;
    @XmlElement(name = "OpNoSujetaReglasLocalizac")
    protected String opNoSujetaReglasLocalizac;
    @XmlElement(name = "OperSujetasISP")
    protected String operSujetasISP;
    @XmlElement(name = "OperNoSujetasReglasLocalizOSS")
    protected String operNoSujetasReglasLocalizOSS;
    @XmlElement(name = "OperSujetasOSS")
    protected String operSujetasOSS;
    @XmlElement(name = "OperREBU")
    protected String operREBU;
    @XmlElement(name = "OperREAV")
    protected String operREAV;
    @XmlElement(name = "TotalVolOperac")
    protected String totalVolOperac;

    /**
     * Obtiene el valor de la propiedad opRegimenGeneral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpRegimenGeneral() {
        return opRegimenGeneral;
    }

    /**
     * Define el valor de la propiedad opRegimenGeneral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpRegimenGeneral(String value) {
        this.opRegimenGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad entregasIntraExenta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntregasIntraExenta() {
        return entregasIntraExenta;
    }

    /**
     * Define el valor de la propiedad entregasIntraExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntregasIntraExenta(String value) {
        this.entregasIntraExenta = value;
    }

    /**
     * Obtiene el valor de la propiedad exportacYotrasOperacExentasConDerechoDeducc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportacYotrasOperacExentasConDerechoDeducc() {
        return exportacYotrasOperacExentasConDerechoDeducc;
    }

    /**
     * Define el valor de la propiedad exportacYotrasOperacExentasConDerechoDeducc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportacYotrasOperacExentasConDerechoDeducc(String value) {
        this.exportacYotrasOperacExentasConDerechoDeducc = value;
    }

    /**
     * Obtiene el valor de la propiedad opExentaSinDeducir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpExentaSinDeducir() {
        return opExentaSinDeducir;
    }

    /**
     * Define el valor de la propiedad opExentaSinDeducir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpExentaSinDeducir(String value) {
        this.opExentaSinDeducir = value;
    }

    /**
     * Obtiene el valor de la propiedad opNoSujetaReglasLocalizac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpNoSujetaReglasLocalizac() {
        return opNoSujetaReglasLocalizac;
    }

    /**
     * Define el valor de la propiedad opNoSujetaReglasLocalizac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpNoSujetaReglasLocalizac(String value) {
        this.opNoSujetaReglasLocalizac = value;
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

    /**
     * Obtiene el valor de la propiedad operREBU.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperREBU() {
        return operREBU;
    }

    /**
     * Define el valor de la propiedad operREBU.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperREBU(String value) {
        this.operREBU = value;
    }

    /**
     * Obtiene el valor de la propiedad operREAV.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperREAV() {
        return operREAV;
    }

    /**
     * Define el valor de la propiedad operREAV.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperREAV(String value) {
        this.operREAV = value;
    }

    /**
     * Obtiene el valor de la propiedad totalVolOperac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalVolOperac() {
        return totalVolOperac;
    }

    /**
     * Define el valor de la propiedad totalVolOperac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalVolOperac(String value) {
        this.totalVolOperac = value;
    }

}
