//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.12.14 a las 07:07:24 PM CET 
//


package com.verifactu.model.xml.generated;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CountryMiembroType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CountryMiembroType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DE"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="BE"/&gt;
 *     &lt;enumeration value="BG"/&gt;
 *     &lt;enumeration value="CZ"/&gt;
 *     &lt;enumeration value="CY"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="DK"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="ES"/&gt;
 *     &lt;enumeration value="EE"/&gt;
 *     &lt;enumeration value="FI"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="GR"/&gt;
 *     &lt;enumeration value="HU"/&gt;
 *     &lt;enumeration value="IE"/&gt;
 *     &lt;enumeration value="IT"/&gt;
 *     &lt;enumeration value="LV"/&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LU"/&gt;
 *     &lt;enumeration value="MT"/&gt;
 *     &lt;enumeration value="NL"/&gt;
 *     &lt;enumeration value="PL"/&gt;
 *     &lt;enumeration value="PT"/&gt;
 *     &lt;enumeration value="GB"/&gt;
 *     &lt;enumeration value="RO"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CountryMiembroType")
@XmlEnum
public enum CountryMiembroType {

    DE,
    AT,
    BE,
    BG,
    CZ,
    CY,
    HR,
    DK,
    SK,
    SI,
    ES,
    EE,
    FI,
    FR,
    GR,
    HU,
    IE,
    IT,
    LV,
    LT,
    LU,
    MT,
    NL,
    PL,
    PT,
    GB,
    RO,
    SE;

    public String value() {
        return name();
    }

    public static CountryMiembroType fromValue(String v) {
        return valueOf(v);
    }

}
