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
 * <p>Clase Java para ClaveTipoFacturaType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ClaveTipoFacturaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F1"/&gt;
 *     &lt;enumeration value="F2"/&gt;
 *     &lt;enumeration value="R1"/&gt;
 *     &lt;enumeration value="R2"/&gt;
 *     &lt;enumeration value="R3"/&gt;
 *     &lt;enumeration value="R4"/&gt;
 *     &lt;enumeration value="R5"/&gt;
 *     &lt;enumeration value="F3"/&gt;
 *     &lt;enumeration value="F4"/&gt;
 *     &lt;enumeration value="F5"/&gt;
 *     &lt;enumeration value="F6"/&gt;
 *     &lt;enumeration value="LC"/&gt;
 *     &lt;enumeration value="AJ"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClaveTipoFacturaType")
@XmlEnum
public enum ClaveTipoFacturaType {


    /**
     * FACTURA
     * 
     */
    @XmlEnumValue("F1")
    F_1("F1"),

    /**
     * FACTURA SIMPLIFICADA
     * 
     */
    @XmlEnumValue("F2")
    F_2("F2"),

    /**
     * FACTURA RECTIFICATIVA	(Art 80.1 y 80.2 y error fundado en derecho)
     * 
     */
    @XmlEnumValue("R1")
    R_1("R1"),

    /**
     * FACTURA RECTIFICATIVA (Art. 80.3)
     * 
     */
    @XmlEnumValue("R2")
    R_2("R2"),

    /**
     * FACTURA RECTIFICATIVA	(Art. 80.4)
     * 
     */
    @XmlEnumValue("R3")
    R_3("R3"),

    /**
     * FACTURA RECTIFICATIVA	(Resto)
     * 
     */
    @XmlEnumValue("R4")
    R_4("R4"),

    /**
     * FACTURA RECTIFICATIVA	EN FACTURAS SIMPLIFICADAS
     * 
     */
    @XmlEnumValue("R5")
    R_5("R5"),

    /**
     * FACTURA EMITIDA EN SUSTITUCIÓN DE FACTURAS SIMPLIFICADAS FACTURADAS Y DECLARADAS
     * 
     */
    @XmlEnumValue("F3")
    F_3("F3"),

    /**
     * ASIENTO RESUMEN DE FACTURAS
     * 
     */
    @XmlEnumValue("F4")
    F_4("F4"),

    /**
     * IMPORTACIONES (DUA)
     * 
     */
    @XmlEnumValue("F5")
    F_5("F5"),

    /**
     * OTROS JUSTIFICANTES CONTABLES
     * 
     */
    @XmlEnumValue("F6")
    F_6("F6"),

    /**
     * ADUANAS - LIQUIDACION COMPLEMENTARIA
     * 
     */
    LC("LC"),

    /**
     * AJUSTE DEL MARGEN DE BENEFICIO
     * 
     */
    AJ("AJ");
    private final String value;

    ClaveTipoFacturaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaveTipoFacturaType fromValue(String v) {
        for (ClaveTipoFacturaType c: ClaveTipoFacturaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
