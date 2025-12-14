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
 * Datos correspondientes a los registros de facturacion
 * 
 * <p>Clase Java para RegistroFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroFacturaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroAlta"/&gt;
 *           &lt;element ref="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegistroAnulacion"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroFacturaType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroLR.xsd", propOrder = {
    "registroAlta",
    "registroAnulacion"
})
public class RegistroFacturaType {

    @XmlElement(name = "RegistroAlta", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd")
    protected RegistroAlta registroAlta;
    @XmlElement(name = "RegistroAnulacion", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd")
    protected RegistroAnulacion registroAnulacion;

    /**
     * Obtiene el valor de la propiedad registroAlta.
     * 
     * @return
     *     possible object is
     *     {@link RegistroAlta }
     *     
     */
    public RegistroAlta getRegistroAlta() {
        return registroAlta;
    }

    /**
     * Define el valor de la propiedad registroAlta.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroAlta }
     *     
     */
    public void setRegistroAlta(RegistroAlta value) {
        this.registroAlta = value;
    }

    /**
     * Obtiene el valor de la propiedad registroAnulacion.
     * 
     * @return
     *     possible object is
     *     {@link RegistroAnulacion }
     *     
     */
    public RegistroAnulacion getRegistroAnulacion() {
        return registroAnulacion;
    }

    /**
     * Define el valor de la propiedad registroAnulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroAnulacion }
     *     
     */
    public void setRegistroAnulacion(RegistroAnulacion value) {
        this.registroAnulacion = value;
    }

}
