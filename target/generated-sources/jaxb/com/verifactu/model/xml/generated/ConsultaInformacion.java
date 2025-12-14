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
 *  Sii - Suministro Inmediato de Información, compuesto por datos 
 * 			                              de contexto y una secuencia de 1 o más registros. 
 * 
 * <p>Clase Java para ConsultaInformacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaInformacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CabeceraConsultaSii"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaInformacion", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    LRConsultaRecibidasType.class,
    LRConsultaEmitidasType.class,
    LRConsultaBienesInversionType.class,
    LRConsultaDetOperIntracomunitariasType.class,
    LRConsultaCobrosMetalicoType.class,
    LRConsultaAgenciasViajesType.class,
    ConsultaCobrosType.class,
    ConsultaInmueblesAdicionalesType.class,
    ConsultaPagosType.class,
    LRConsultaLROperacionesSegurosType.class,
    LRConsultaVentaBienesConsignaType.class,
    ConsultaLLAAType.class,
    RespuestaConsultaLRLLAAType.class,
    RespuestaConsultaLRFacturasType.class,
    RespuestaConsultaLRVentaBVType.class,
    RespuestaConsultaFacturaCobrosType.class,
    RespuestaConsultaInmueblesType.class,
    RespuestaConsultaFacturaPagosType.class
})
public class ConsultaInformacion {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaSii cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraConsultaSii }
     *     
     */
    public CabeceraConsultaSii getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraConsultaSii }
     *     
     */
    public void setCabecera(CabeceraConsultaSii value) {
        this.cabecera = value;
    }

}
