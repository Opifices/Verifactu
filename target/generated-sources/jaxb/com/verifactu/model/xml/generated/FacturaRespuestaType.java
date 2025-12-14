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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Datos comunes de facturas emitidas y recibidas 
 * 
 * <p>Clase Java para FacturaRespuestaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaRespuestaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ClaveTipoFacturaType"/&gt;
 *         &lt;element name="TipoRectificativa" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ClaveTipoRectificativaType" minOccurs="0"/&gt;
 *         &lt;element name="FacturasAgrupadas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDFacturaAgrupada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FacturasRectificadas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDFacturaRectificada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImporteRectificacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DesgloseRectificacionType" minOccurs="0"/&gt;
 *         &lt;element name="FechaOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *         &lt;element name="ClaveRegimenEspecialOTrascendencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType"/&gt;
 *         &lt;element name="ClaveRegimenEspecialOTrascendenciaAdicional1" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType" minOccurs="0"/&gt;
 *         &lt;element name="ClaveRegimenEspecialOTrascendenciaAdicional2" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType" minOccurs="0"/&gt;
 *         &lt;element name="NumRegistroAcuerdoFacturacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax15Type" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTotal" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponibleACoste" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax500Type"/&gt;
 *         &lt;element name="RefExterna" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TextMax60Type" minOccurs="0"/&gt;
 *         &lt;element name="FacturaSimplificadaArticulos7.2_7.3" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}SimplificadaCualificadaType" minOccurs="0"/&gt;
 *         &lt;element name="EntidadSucedida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaUnicaESType" minOccurs="0"/&gt;
 *         &lt;element name="RegPrevioGGEEoREDEMEoCompetencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}RegPrevioGGEEoREDEMEoCompetenciaType" minOccurs="0"/&gt;
 *         &lt;element name="Macrodato" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}MacrodatoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaRespuestaType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", propOrder = {
    "tipoFactura",
    "tipoRectificativa",
    "facturasAgrupadas",
    "facturasRectificadas",
    "importeRectificacion",
    "fechaOperacion",
    "claveRegimenEspecialOTrascendencia",
    "claveRegimenEspecialOTrascendenciaAdicional1",
    "claveRegimenEspecialOTrascendenciaAdicional2",
    "numRegistroAcuerdoFacturacion",
    "importeTotal",
    "baseImponibleACoste",
    "descripcionOperacion",
    "refExterna",
    "facturaSimplificadaArticulos7273",
    "entidadSucedida",
    "regPrevioGGEEoREDEMEoCompetencia",
    "macrodato"
})
@XmlSeeAlso({
    FacturaRespuestaExpedidaType.class,
    FacturaRespuestaRecibidaType.class,
    FacturaRespuestaInformadaClienteType.class,
    FacturaRespuestaInformadaProveedorType.class
})
public class FacturaRespuestaType {

    @XmlElement(name = "TipoFactura", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveTipoFacturaType tipoFactura;
    @XmlElement(name = "TipoRectificativa")
    protected String tipoRectificativa;
    @XmlElement(name = "FacturasAgrupadas")
    protected FacturaRespuestaType.FacturasAgrupadas facturasAgrupadas;
    @XmlElement(name = "FacturasRectificadas")
    protected FacturaRespuestaType.FacturasRectificadas facturasRectificadas;
    @XmlElement(name = "ImporteRectificacion")
    protected DesgloseRectificacionType importeRectificacion;
    @XmlElement(name = "FechaOperacion")
    protected String fechaOperacion;
    @XmlElement(name = "ClaveRegimenEspecialOTrascendencia", required = true)
    protected String claveRegimenEspecialOTrascendencia;
    @XmlElement(name = "ClaveRegimenEspecialOTrascendenciaAdicional1")
    protected String claveRegimenEspecialOTrascendenciaAdicional1;
    @XmlElement(name = "ClaveRegimenEspecialOTrascendenciaAdicional2")
    protected String claveRegimenEspecialOTrascendenciaAdicional2;
    @XmlElement(name = "NumRegistroAcuerdoFacturacion")
    protected String numRegistroAcuerdoFacturacion;
    @XmlElement(name = "ImporteTotal")
    protected String importeTotal;
    @XmlElement(name = "BaseImponibleACoste")
    protected String baseImponibleACoste;
    @XmlElement(name = "DescripcionOperacion", required = true)
    protected String descripcionOperacion;
    @XmlElement(name = "RefExterna")
    protected String refExterna;
    @XmlElement(name = "FacturaSimplificadaArticulos7.2_7.3")
    @XmlSchemaType(name = "string")
    protected SimplificadaCualificadaType facturaSimplificadaArticulos7273;
    @XmlElement(name = "EntidadSucedida")
    protected PersonaFisicaJuridicaUnicaESType entidadSucedida;
    @XmlElement(name = "RegPrevioGGEEoREDEMEoCompetencia")
    @XmlSchemaType(name = "string")
    protected RegPrevioGGEEoREDEMEoCompetenciaType regPrevioGGEEoREDEMEoCompetencia;
    @XmlElement(name = "Macrodato")
    @XmlSchemaType(name = "string")
    protected MacrodatoType macrodato;

    /**
     * Obtiene el valor de la propiedad tipoFactura.
     * 
     * @return
     *     possible object is
     *     {@link ClaveTipoFacturaType }
     *     
     */
    public ClaveTipoFacturaType getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Define el valor de la propiedad tipoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveTipoFacturaType }
     *     
     */
    public void setTipoFactura(ClaveTipoFacturaType value) {
        this.tipoFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRectificativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRectificativa() {
        return tipoRectificativa;
    }

    /**
     * Define el valor de la propiedad tipoRectificativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRectificativa(String value) {
        this.tipoRectificativa = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasAgrupadas.
     * 
     * @return
     *     possible object is
     *     {@link FacturaRespuestaType.FacturasAgrupadas }
     *     
     */
    public FacturaRespuestaType.FacturasAgrupadas getFacturasAgrupadas() {
        return facturasAgrupadas;
    }

    /**
     * Define el valor de la propiedad facturasAgrupadas.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaRespuestaType.FacturasAgrupadas }
     *     
     */
    public void setFacturasAgrupadas(FacturaRespuestaType.FacturasAgrupadas value) {
        this.facturasAgrupadas = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasRectificadas.
     * 
     * @return
     *     possible object is
     *     {@link FacturaRespuestaType.FacturasRectificadas }
     *     
     */
    public FacturaRespuestaType.FacturasRectificadas getFacturasRectificadas() {
        return facturasRectificadas;
    }

    /**
     * Define el valor de la propiedad facturasRectificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaRespuestaType.FacturasRectificadas }
     *     
     */
    public void setFacturasRectificadas(FacturaRespuestaType.FacturasRectificadas value) {
        this.facturasRectificadas = value;
    }

    /**
     * Obtiene el valor de la propiedad importeRectificacion.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseRectificacionType }
     *     
     */
    public DesgloseRectificacionType getImporteRectificacion() {
        return importeRectificacion;
    }

    /**
     * Define el valor de la propiedad importeRectificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseRectificacionType }
     *     
     */
    public void setImporteRectificacion(DesgloseRectificacionType value) {
        this.importeRectificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimenEspecialOTrascendencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimenEspecialOTrascendencia() {
        return claveRegimenEspecialOTrascendencia;
    }

    /**
     * Define el valor de la propiedad claveRegimenEspecialOTrascendencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimenEspecialOTrascendencia(String value) {
        this.claveRegimenEspecialOTrascendencia = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimenEspecialOTrascendenciaAdicional1() {
        return claveRegimenEspecialOTrascendenciaAdicional1;
    }

    /**
     * Define el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimenEspecialOTrascendenciaAdicional1(String value) {
        this.claveRegimenEspecialOTrascendenciaAdicional1 = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimenEspecialOTrascendenciaAdicional2() {
        return claveRegimenEspecialOTrascendenciaAdicional2;
    }

    /**
     * Define el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimenEspecialOTrascendenciaAdicional2(String value) {
        this.claveRegimenEspecialOTrascendenciaAdicional2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistroAcuerdoFacturacion() {
        return numRegistroAcuerdoFacturacion;
    }

    /**
     * Define el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistroAcuerdoFacturacion(String value) {
        this.numRegistroAcuerdoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotal(String value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleACoste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleACoste() {
        return baseImponibleACoste;
    }

    /**
     * Define el valor de la propiedad baseImponibleACoste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleACoste(String value) {
        this.baseImponibleACoste = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    /**
     * Define el valor de la propiedad descripcionOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionOperacion(String value) {
        this.descripcionOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad refExterna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefExterna() {
        return refExterna;
    }

    /**
     * Define el valor de la propiedad refExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefExterna(String value) {
        this.refExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaSimplificadaArticulos7273.
     * 
     * @return
     *     possible object is
     *     {@link SimplificadaCualificadaType }
     *     
     */
    public SimplificadaCualificadaType getFacturaSimplificadaArticulos7273() {
        return facturaSimplificadaArticulos7273;
    }

    /**
     * Define el valor de la propiedad facturaSimplificadaArticulos7273.
     * 
     * @param value
     *     allowed object is
     *     {@link SimplificadaCualificadaType }
     *     
     */
    public void setFacturaSimplificadaArticulos7273(SimplificadaCualificadaType value) {
        this.facturaSimplificadaArticulos7273 = value;
    }

    /**
     * Obtiene el valor de la propiedad entidadSucedida.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public PersonaFisicaJuridicaUnicaESType getEntidadSucedida() {
        return entidadSucedida;
    }

    /**
     * Define el valor de la propiedad entidadSucedida.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaUnicaESType }
     *     
     */
    public void setEntidadSucedida(PersonaFisicaJuridicaUnicaESType value) {
        this.entidadSucedida = value;
    }

    /**
     * Obtiene el valor de la propiedad regPrevioGGEEoREDEMEoCompetencia.
     * 
     * @return
     *     possible object is
     *     {@link RegPrevioGGEEoREDEMEoCompetenciaType }
     *     
     */
    public RegPrevioGGEEoREDEMEoCompetenciaType getRegPrevioGGEEoREDEMEoCompetencia() {
        return regPrevioGGEEoREDEMEoCompetencia;
    }

    /**
     * Define el valor de la propiedad regPrevioGGEEoREDEMEoCompetencia.
     * 
     * @param value
     *     allowed object is
     *     {@link RegPrevioGGEEoREDEMEoCompetenciaType }
     *     
     */
    public void setRegPrevioGGEEoREDEMEoCompetencia(RegPrevioGGEEoREDEMEoCompetenciaType value) {
        this.regPrevioGGEEoREDEMEoCompetencia = value;
    }

    /**
     * Obtiene el valor de la propiedad macrodato.
     * 
     * @return
     *     possible object is
     *     {@link MacrodatoType }
     *     
     */
    public MacrodatoType getMacrodato() {
        return macrodato;
    }

    /**
     * Define el valor de la propiedad macrodato.
     * 
     * @param value
     *     allowed object is
     *     {@link MacrodatoType }
     *     
     */
    public void setMacrodato(MacrodatoType value) {
        this.macrodato = value;
    }


    /**
     * El ID de los tickets agrupados, únicamente se rellena en el caso de agrupación de tickets en factura
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IDFacturaAgrupada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idFacturaAgrupada"
    })
    public static class FacturasAgrupadas {

        @XmlElement(name = "IDFacturaAgrupada", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", required = true)
        protected List<IDFacturaARType> idFacturaAgrupada;

        /**
         * Gets the value of the idFacturaAgrupada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the idFacturaAgrupada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDFacturaAgrupada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDFacturaARType }
         * 
         * 
         */
        public List<IDFacturaARType> getIDFacturaAgrupada() {
            if (idFacturaAgrupada == null) {
                idFacturaAgrupada = new ArrayList<IDFacturaARType>();
            }
            return this.idFacturaAgrupada;
        }

    }


    /**
     * El ID de las facturas rectificadas, únicamente se rellena en el caso de rectificación de facturas
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IDFacturaRectificada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "idFacturaRectificada"
    })
    public static class FacturasRectificadas {

        @XmlElement(name = "IDFacturaRectificada", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/RespuestaConsultaLR.xsd", required = true)
        protected List<IDFacturaARType> idFacturaRectificada;

        /**
         * Gets the value of the idFacturaRectificada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the idFacturaRectificada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDFacturaRectificada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDFacturaARType }
         * 
         * 
         */
        public List<IDFacturaARType> getIDFacturaRectificada() {
            if (idFacturaRectificada == null) {
                idFacturaRectificada = new ArrayList<IDFacturaARType>();
            }
            return this.idFacturaRectificada;
        }

    }

}
