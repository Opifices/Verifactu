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
 * <p>Clase Java para ConsultaPagosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaPagosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ConsultaInformacion"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FiltroConsultaPagos" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd}LRFiltroPagosType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPagosType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/ConsultaLR.xsd", propOrder = {
    "filtroConsultaPagos"
})
public class ConsultaPagosType
    extends ConsultaInformacion
{

    @XmlElement(name = "FiltroConsultaPagos", required = true)
    protected LRFiltroPagosType filtroConsultaPagos;

    /**
     * Obtiene el valor de la propiedad filtroConsultaPagos.
     * 
     * @return
     *     possible object is
     *     {@link LRFiltroPagosType }
     *     
     */
    public LRFiltroPagosType getFiltroConsultaPagos() {
        return filtroConsultaPagos;
    }

    /**
     * Define el valor de la propiedad filtroConsultaPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link LRFiltroPagosType }
     *     
     */
    public void setFiltroConsultaPagos(LRFiltroPagosType value) {
        this.filtroConsultaPagos = value;
    }

}
