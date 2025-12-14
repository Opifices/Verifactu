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
 * <p>Clase Java para DatosDescuadreContraparteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosDescuadreContraparteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SumBaseImponibleISP" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn14.2Type" minOccurs="0"/&gt;
 *         &lt;element name="SumBaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn14.2Type" minOccurs="0"/&gt;
 *         &lt;element name="SumCuota" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn14.2Type" minOccurs="0"/&gt;
 *         &lt;element name="SumCuotaRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn14.2Type" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTotal" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosDescuadreContraparteType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "sumBaseImponibleISP",
    "sumBaseImponible",
    "sumCuota",
    "sumCuotaRecargoEquivalencia",
    "importeTotal"
})
public class DatosDescuadreContraparteType {

    @XmlElement(name = "SumBaseImponibleISP")
    protected String sumBaseImponibleISP;
    @XmlElement(name = "SumBaseImponible")
    protected String sumBaseImponible;
    @XmlElement(name = "SumCuota")
    protected String sumCuota;
    @XmlElement(name = "SumCuotaRecargoEquivalencia")
    protected String sumCuotaRecargoEquivalencia;
    @XmlElement(name = "ImporteTotal")
    protected String importeTotal;

    /**
     * Obtiene el valor de la propiedad sumBaseImponibleISP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumBaseImponibleISP() {
        return sumBaseImponibleISP;
    }

    /**
     * Define el valor de la propiedad sumBaseImponibleISP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumBaseImponibleISP(String value) {
        this.sumBaseImponibleISP = value;
    }

    /**
     * Obtiene el valor de la propiedad sumBaseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumBaseImponible() {
        return sumBaseImponible;
    }

    /**
     * Define el valor de la propiedad sumBaseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumBaseImponible(String value) {
        this.sumBaseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad sumCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumCuota() {
        return sumCuota;
    }

    /**
     * Define el valor de la propiedad sumCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumCuota(String value) {
        this.sumCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad sumCuotaRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumCuotaRecargoEquivalencia() {
        return sumCuotaRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad sumCuotaRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumCuotaRecargoEquivalencia(String value) {
        this.sumCuotaRecargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotal(String value) {
        this.importeTotal = value;
    }

}
