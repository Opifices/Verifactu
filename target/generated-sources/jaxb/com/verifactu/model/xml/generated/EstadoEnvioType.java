//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.12.14 a las 07:07:24 PM CET 
//


package com.verifactu.model.xml.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoEnvioType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="EstadoEnvioType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Correcto"/&gt;
 *     &lt;enumeration value="ParcialmenteCorrecto"/&gt;
 *     &lt;enumeration value="Incorrecto"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EstadoEnvioType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaSuministro.xsd")
@XmlEnum
public enum EstadoEnvioType {


    /**
     * Correcto
     * 
     */
    @XmlEnumValue("Correcto")
    CORRECTO("Correcto"),

    /**
     * Parcialmente correcto. Ver detalle de errores
     * 
     */
    @XmlEnumValue("ParcialmenteCorrecto")
    PARCIALMENTE_CORRECTO("ParcialmenteCorrecto"),

    /**
     * Incorrecto
     * 
     */
    @XmlEnumValue("Incorrecto")
    INCORRECTO("Incorrecto");
    private final String value;

    EstadoEnvioType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EstadoEnvioType fromValue(String v) {
        for (EstadoEnvioType c: EstadoEnvioType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
