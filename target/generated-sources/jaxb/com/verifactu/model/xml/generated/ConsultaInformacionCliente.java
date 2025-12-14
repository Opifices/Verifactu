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
 *  Sii - Suministro Inmediato de Información, compuesto por datos de contexto y una secuencia de 1 o más registros. 
 * 
 * <p>Clase Java para ConsultaInformacionCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaInformacionCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CabeceraConsultaSiiCliente"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaInformacionCliente", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    ConsultaLRFactInformadasClienteType.class,
    ConsultaLRFactInformadasAgrupadasClienteType.class,
    RespuestaConsultaLRFacturasClienteType.class,
    RespuestaConsultaLRFacturasAgrupadasClienteType.class
})
public class ConsultaInformacionCliente {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaSiiCliente cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraConsultaSiiCliente }
     *     
     */
    public CabeceraConsultaSiiCliente getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraConsultaSiiCliente }
     *     
     */
    public void setCabecera(CabeceraConsultaSiiCliente value) {
        this.cabecera = value;
    }

}
