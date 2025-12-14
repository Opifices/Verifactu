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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaConsultaLRFacturasAgrupadasProveedorType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLRFacturasAgrupadasProveedorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ConsultaInformacionProveedor"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultadoConsulta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd}ResultadoConsultaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLRFacturasAgrupadasProveedorType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "resultadoConsulta"
})
@XmlSeeAlso({
    RespuestaConsultaLRFactInformadasAgrupadasProveedorType.class
})
public class RespuestaConsultaLRFacturasAgrupadasProveedorType
    extends ConsultaInformacionProveedor
{

    @XmlElement(name = "ResultadoConsulta", required = true)
    @XmlSchemaType(name = "string")
    protected ResultadoConsultaType resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad resultadoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoConsultaType }
     *     
     */
    public ResultadoConsultaType getResultadoConsulta() {
        return resultadoConsulta;
    }

    /**
     * Define el valor de la propiedad resultadoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoConsultaType }
     *     
     */
    public void setResultadoConsulta(ResultadoConsultaType value) {
        this.resultadoConsulta = value;
    }

}
