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
 * <p>Clase Java para RespuestaConsultaLLAAType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLLAAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaConsultaLRLLAAType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistroRespuestaConsultaLLAA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaLLAAType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLLAAType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "registroRespuestaConsultaLLAA"
})
public class RespuestaConsultaLLAAType
    extends RespuestaConsultaLRLLAAType
{

    @XmlElement(name = "RegistroRespuestaConsultaLLAA", required = true)
    protected RegistroRespuestaConsultaLLAAType registroRespuestaConsultaLLAA;

    /**
     * Obtiene el valor de la propiedad registroRespuestaConsultaLLAA.
     * 
     * @return
     *     possible object is
     *     {@link RegistroRespuestaConsultaLLAAType }
     *     
     */
    public RegistroRespuestaConsultaLLAAType getRegistroRespuestaConsultaLLAA() {
        return registroRespuestaConsultaLLAA;
    }

    /**
     * Define el valor de la propiedad registroRespuestaConsultaLLAA.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroRespuestaConsultaLLAAType }
     *     
     */
    public void setRegistroRespuestaConsultaLLAA(RegistroRespuestaConsultaLLAAType value) {
        this.registroRespuestaConsultaLLAA = value;
    }

}
