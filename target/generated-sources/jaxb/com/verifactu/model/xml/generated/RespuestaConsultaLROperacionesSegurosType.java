//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.12.14 a las 07:07:24 PM CET 
//


package com.verifactu.model.xml.generated;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaConsultaLROperacionesSegurosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLROperacionesSegurosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaConsultaLRFacturasType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistroRespuestaConsultaLROperacionesSeguros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaOperacionesSegurosType" maxOccurs="10000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLROperacionesSegurosType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "registroRespuestaConsultaLROperacionesSeguros"
})
public class RespuestaConsultaLROperacionesSegurosType
    extends RespuestaConsultaLRFacturasType
{

    @XmlElement(name = "RegistroRespuestaConsultaLROperacionesSeguros")
    protected List<RegistroRespuestaConsultaOperacionesSegurosType> registroRespuestaConsultaLROperacionesSeguros;

    /**
     * Gets the value of the registroRespuestaConsultaLROperacionesSeguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaLROperacionesSeguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaLROperacionesSeguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaOperacionesSegurosType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaOperacionesSegurosType> getRegistroRespuestaConsultaLROperacionesSeguros() {
        if (registroRespuestaConsultaLROperacionesSeguros == null) {
            registroRespuestaConsultaLROperacionesSeguros = new ArrayList<RegistroRespuestaConsultaOperacionesSegurosType>();
        }
        return this.registroRespuestaConsultaLROperacionesSeguros;
    }

}
