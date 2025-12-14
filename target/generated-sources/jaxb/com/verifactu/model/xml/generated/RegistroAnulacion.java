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
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroSii"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaExpedidaType"/&gt;
 *         &lt;element name="Trazabilidad" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TrazabilidadType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idFactura",
    "trazabilidad"
})
@XmlRootElement(name = "RegistroAnulacion")
public class RegistroAnulacion
    extends RegistroSii
{

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaExpedidaType idFactura;
    @XmlElement(name = "Trazabilidad", required = true)
    protected TrazabilidadType trazabilidad;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public IDFacturaExpedidaType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public void setIDFactura(IDFacturaExpedidaType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad trazabilidad.
     * 
     * @return
     *     possible object is
     *     {@link TrazabilidadType }
     *     
     */
    public TrazabilidadType getTrazabilidad() {
        return trazabilidad;
    }

    /**
     * Define el valor de la propiedad trazabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link TrazabilidadType }
     *     
     */
    public void setTrazabilidad(TrazabilidadType value) {
        this.trazabilidad = value;
    }

}
