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
 * Desglose de Tipo de Operacion diferenciando entre Entrega de Bienes o Prestacion de Servicios
 * 
 * <p>Clase Java para TipoConDesgloseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoConDesgloseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrestacionServicios" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoSinDesglosePrestacionType" minOccurs="0"/&gt;
 *         &lt;element name="Entrega" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoSinDesgloseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoConDesgloseType", propOrder = {
    "prestacionServicios",
    "entrega"
})
public class TipoConDesgloseType {

    @XmlElement(name = "PrestacionServicios")
    protected TipoSinDesglosePrestacionType prestacionServicios;
    @XmlElement(name = "Entrega")
    protected TipoSinDesgloseType entrega;

    /**
     * Obtiene el valor de la propiedad prestacionServicios.
     * 
     * @return
     *     possible object is
     *     {@link TipoSinDesglosePrestacionType }
     *     
     */
    public TipoSinDesglosePrestacionType getPrestacionServicios() {
        return prestacionServicios;
    }

    /**
     * Define el valor de la propiedad prestacionServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSinDesglosePrestacionType }
     *     
     */
    public void setPrestacionServicios(TipoSinDesglosePrestacionType value) {
        this.prestacionServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad entrega.
     * 
     * @return
     *     possible object is
     *     {@link TipoSinDesgloseType }
     *     
     */
    public TipoSinDesgloseType getEntrega() {
        return entrega;
    }

    /**
     * Define el valor de la propiedad entrega.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSinDesgloseType }
     *     
     */
    public void setEntrega(TipoSinDesgloseType value) {
        this.entrega = value;
    }

}
