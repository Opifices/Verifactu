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
 * <p>Clase Java para RespuestaConsultaLRFactInformadasProveedorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLRFactInformadasProveedorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RespuestaConsultaLRFacturasProveedorType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistroRespuestaConsultaLRFactInformadasProveedor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaFactInformadasProveedorType" maxOccurs="10000" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLRFactInformadasProveedorType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "registroRespuestaConsultaLRFactInformadasProveedor"
})
public class RespuestaConsultaLRFactInformadasProveedorType
    extends RespuestaConsultaLRFacturasProveedorType
{

    @XmlElement(name = "RegistroRespuestaConsultaLRFactInformadasProveedor")
    protected List<RegistroRespuestaConsultaFactInformadasProveedorType> registroRespuestaConsultaLRFactInformadasProveedor;

    /**
     * Gets the value of the registroRespuestaConsultaLRFactInformadasProveedor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaLRFactInformadasProveedor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaLRFactInformadasProveedor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaFactInformadasProveedorType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaFactInformadasProveedorType> getRegistroRespuestaConsultaLRFactInformadasProveedor() {
        if (registroRespuestaConsultaLRFactInformadasProveedor == null) {
            registroRespuestaConsultaLRFactInformadasProveedor = new ArrayList<RegistroRespuestaConsultaFactInformadasProveedorType>();
        }
        return this.registroRespuestaConsultaLRFactInformadasProveedor;
    }

}
