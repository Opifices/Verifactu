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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleExentaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleExentaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CausaExencion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CausaExencionType" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleExentaType", propOrder = {
    "causaExencion",
    "baseImponible"
})
public class DetalleExentaType {

    @XmlElement(name = "CausaExencion")
    @XmlSchemaType(name = "string")
    protected CausaExencionType causaExencion;
    @XmlElement(name = "BaseImponible", required = true)
    protected String baseImponible;

    /**
     * Obtiene el valor de la propiedad causaExencion.
     * 
     * @return
     *     possible object is
     *     {@link CausaExencionType }
     *     
     */
    public CausaExencionType getCausaExencion() {
        return causaExencion;
    }

    /**
     * Define el valor de la propiedad causaExencion.
     * 
     * @param value
     *     allowed object is
     *     {@link CausaExencionType }
     *     
     */
    public void setCausaExencion(CausaExencionType value) {
        this.causaExencion = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponible(String value) {
        this.baseImponible = value;
    }

}
