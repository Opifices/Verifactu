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
 * <p>Clase Java para RespuestaConsultaLRFactInformadasAgrupadasClienteType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLRFactInformadasAgrupadasClienteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaConsultaLRFacturasAgrupadasClienteType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistroRespuestaConsultaLRFactInformadasAgrupadasCliente" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaFactInformadasAgrupadasClienteType" maxOccurs="10000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLRFactInformadasAgrupadasClienteType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "registroRespuestaConsultaLRFactInformadasAgrupadasCliente"
})
public class RespuestaConsultaLRFactInformadasAgrupadasClienteType
    extends RespuestaConsultaLRFacturasAgrupadasClienteType
{

    @XmlElement(name = "RegistroRespuestaConsultaLRFactInformadasAgrupadasCliente")
    protected List<RegistroRespuestaConsultaFactInformadasAgrupadasClienteType> registroRespuestaConsultaLRFactInformadasAgrupadasCliente;

    /**
     * Gets the value of the registroRespuestaConsultaLRFactInformadasAgrupadasCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaLRFactInformadasAgrupadasCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaLRFactInformadasAgrupadasCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaFactInformadasAgrupadasClienteType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaFactInformadasAgrupadasClienteType> getRegistroRespuestaConsultaLRFactInformadasAgrupadasCliente() {
        if (registroRespuestaConsultaLRFactInformadasAgrupadasCliente == null) {
            registroRespuestaConsultaLRFactInformadasAgrupadasCliente = new ArrayList<RegistroRespuestaConsultaFactInformadasAgrupadasClienteType>();
        }
        return this.registroRespuestaConsultaLRFactInformadasAgrupadasCliente;
    }

}
