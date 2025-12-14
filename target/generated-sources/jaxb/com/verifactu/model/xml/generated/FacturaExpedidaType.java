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
import jakarta.xml.bind.annotation.XmlType;


/**
 *  Apunte correspondiente al libro de facturas expedidas. 
 * 
 * <p>Clase Java para FacturaExpedidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaExpedidaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}FacturaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosInmueble" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DetalleInmueble" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DatosInmuebleType" maxOccurs="15"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImporteTransmisionInmueblesSujetoAIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="EmitidaPorTercerosODestinatario" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}EmitidaPorTercerosType" minOccurs="0"/&gt;
 *         &lt;element name="FacturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}EmitidaPorTercerosType" minOccurs="0"/&gt;
 *         &lt;element name="VariosDestinatarios" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}VariosDestinatariosType" minOccurs="0"/&gt;
 *         &lt;element name="Cupon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CuponType" minOccurs="0"/&gt;
 *         &lt;element name="FacturaSinIdentifDestinatarioAritculo6.1.d" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}CompletaSinDestinatarioType" minOccurs="0"/&gt;
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" minOccurs="0"/&gt;
 *         &lt;element name="TipoDesglose"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="DesgloseFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoSinDesgloseType"/&gt;
 *                   &lt;element name="DesgloseTipoOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoConDesgloseType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaExpedidaType", propOrder = {
    "datosInmueble",
    "importeTransmisionInmueblesSujetoAIVA",
    "emitidaPorTercerosODestinatario",
    "facturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas",
    "variosDestinatarios",
    "cupon",
    "facturaSinIdentifDestinatarioAritculo61D",
    "contraparte",
    "tipoDesglose"
})
public class FacturaExpedidaType
    extends FacturaType
{

    @XmlElement(name = "DatosInmueble")
    protected FacturaExpedidaType.DatosInmueble datosInmueble;
    @XmlElement(name = "ImporteTransmisionInmueblesSujetoAIVA")
    protected String importeTransmisionInmueblesSujetoAIVA;
    @XmlElement(name = "EmitidaPorTercerosODestinatario")
    @XmlSchemaType(name = "string")
    protected EmitidaPorTercerosType emitidaPorTercerosODestinatario;
    @XmlElement(name = "FacturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas")
    @XmlSchemaType(name = "string")
    protected EmitidaPorTercerosType facturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas;
    @XmlElement(name = "VariosDestinatarios")
    @XmlSchemaType(name = "string")
    protected VariosDestinatariosType variosDestinatarios;
    @XmlElement(name = "Cupon")
    @XmlSchemaType(name = "string")
    protected CuponType cupon;
    @XmlElement(name = "FacturaSinIdentifDestinatarioAritculo6.1.d")
    @XmlSchemaType(name = "string")
    protected CompletaSinDestinatarioType facturaSinIdentifDestinatarioAritculo61D;
    @XmlElement(name = "Contraparte")
    protected PersonaFisicaJuridicaType contraparte;
    @XmlElement(name = "TipoDesglose", required = true)
    protected FacturaExpedidaType.TipoDesglose tipoDesglose;

    /**
     * Obtiene el valor de la propiedad datosInmueble.
     * 
     * @return
     *     possible object is
     *     {@link FacturaExpedidaType.DatosInmueble }
     *     
     */
    public FacturaExpedidaType.DatosInmueble getDatosInmueble() {
        return datosInmueble;
    }

    /**
     * Define el valor de la propiedad datosInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaExpedidaType.DatosInmueble }
     *     
     */
    public void setDatosInmueble(FacturaExpedidaType.DatosInmueble value) {
        this.datosInmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTransmisionInmueblesSujetoAIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTransmisionInmueblesSujetoAIVA() {
        return importeTransmisionInmueblesSujetoAIVA;
    }

    /**
     * Define el valor de la propiedad importeTransmisionInmueblesSujetoAIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTransmisionInmueblesSujetoAIVA(String value) {
        this.importeTransmisionInmueblesSujetoAIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad emitidaPorTercerosODestinatario.
     * 
     * @return
     *     possible object is
     *     {@link EmitidaPorTercerosType }
     *     
     */
    public EmitidaPorTercerosType getEmitidaPorTercerosODestinatario() {
        return emitidaPorTercerosODestinatario;
    }

    /**
     * Define el valor de la propiedad emitidaPorTercerosODestinatario.
     * 
     * @param value
     *     allowed object is
     *     {@link EmitidaPorTercerosType }
     *     
     */
    public void setEmitidaPorTercerosODestinatario(EmitidaPorTercerosType value) {
        this.emitidaPorTercerosODestinatario = value;
    }

    /**
     * Obtiene el valor de la propiedad facturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas.
     * 
     * @return
     *     possible object is
     *     {@link EmitidaPorTercerosType }
     *     
     */
    public EmitidaPorTercerosType getFacturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas() {
        return facturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas;
    }

    /**
     * Define el valor de la propiedad facturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas.
     * 
     * @param value
     *     allowed object is
     *     {@link EmitidaPorTercerosType }
     *     
     */
    public void setFacturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas(EmitidaPorTercerosType value) {
        this.facturacionDispAdicionalTerceraYsextayDelMercadoOrganizadoDelGas = value;
    }

    /**
     * Obtiene el valor de la propiedad variosDestinatarios.
     * 
     * @return
     *     possible object is
     *     {@link VariosDestinatariosType }
     *     
     */
    public VariosDestinatariosType getVariosDestinatarios() {
        return variosDestinatarios;
    }

    /**
     * Define el valor de la propiedad variosDestinatarios.
     * 
     * @param value
     *     allowed object is
     *     {@link VariosDestinatariosType }
     *     
     */
    public void setVariosDestinatarios(VariosDestinatariosType value) {
        this.variosDestinatarios = value;
    }

    /**
     * Obtiene el valor de la propiedad cupon.
     * 
     * @return
     *     possible object is
     *     {@link CuponType }
     *     
     */
    public CuponType getCupon() {
        return cupon;
    }

    /**
     * Define el valor de la propiedad cupon.
     * 
     * @param value
     *     allowed object is
     *     {@link CuponType }
     *     
     */
    public void setCupon(CuponType value) {
        this.cupon = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaSinIdentifDestinatarioAritculo61D.
     * 
     * @return
     *     possible object is
     *     {@link CompletaSinDestinatarioType }
     *     
     */
    public CompletaSinDestinatarioType getFacturaSinIdentifDestinatarioAritculo61D() {
        return facturaSinIdentifDestinatarioAritculo61D;
    }

    /**
     * Define el valor de la propiedad facturaSinIdentifDestinatarioAritculo61D.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletaSinDestinatarioType }
     *     
     */
    public void setFacturaSinIdentifDestinatarioAritculo61D(CompletaSinDestinatarioType value) {
        this.facturaSinIdentifDestinatarioAritculo61D = value;
    }

    /**
     * Obtiene el valor de la propiedad contraparte.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }

    /**
     * Define el valor de la propiedad contraparte.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setContraparte(PersonaFisicaJuridicaType value) {
        this.contraparte = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDesglose.
     * 
     * @return
     *     possible object is
     *     {@link FacturaExpedidaType.TipoDesglose }
     *     
     */
    public FacturaExpedidaType.TipoDesglose getTipoDesglose() {
        return tipoDesglose;
    }

    /**
     * Define el valor de la propiedad tipoDesglose.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaExpedidaType.TipoDesglose }
     *     
     */
    public void setTipoDesglose(FacturaExpedidaType.TipoDesglose value) {
        this.tipoDesglose = value;
    }


    /**
     * Desglose de inmuebles
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
     *         &lt;element name="DetalleInmueble" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}DatosInmuebleType" maxOccurs="15"/&gt;
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
        "detalleInmueble"
    })
    public static class DatosInmueble {

        @XmlElement(name = "DetalleInmueble", required = true)
        protected List<DatosInmuebleType> detalleInmueble;

        /**
         * Gets the value of the detalleInmueble property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the detalleInmueble property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalleInmueble().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatosInmuebleType }
         * 
         * 
         */
        public List<DatosInmuebleType> getDetalleInmueble() {
            if (detalleInmueble == null) {
                detalleInmueble = new ArrayList<DatosInmuebleType>();
            }
            return this.detalleInmueble;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="DesgloseFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoSinDesgloseType"/&gt;
     *         &lt;element name="DesgloseTipoOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/tike/cont/ws/SuministroInformacion.xsd}TipoConDesgloseType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "desgloseFactura",
        "desgloseTipoOperacion"
    })
    public static class TipoDesglose {

        @XmlElement(name = "DesgloseFactura")
        protected TipoSinDesgloseType desgloseFactura;
        @XmlElement(name = "DesgloseTipoOperacion")
        protected TipoConDesgloseType desgloseTipoOperacion;

        /**
         * Obtiene el valor de la propiedad desgloseFactura.
         * 
         * @return
         *     possible object is
         *     {@link TipoSinDesgloseType }
         *     
         */
        public TipoSinDesgloseType getDesgloseFactura() {
            return desgloseFactura;
        }

        /**
         * Define el valor de la propiedad desgloseFactura.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoSinDesgloseType }
         *     
         */
        public void setDesgloseFactura(TipoSinDesgloseType value) {
            this.desgloseFactura = value;
        }

        /**
         * Obtiene el valor de la propiedad desgloseTipoOperacion.
         * 
         * @return
         *     possible object is
         *     {@link TipoConDesgloseType }
         *     
         */
        public TipoConDesgloseType getDesgloseTipoOperacion() {
            return desgloseTipoOperacion;
        }

        /**
         * Define el valor de la propiedad desgloseTipoOperacion.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoConDesgloseType }
         *     
         */
        public void setDesgloseTipoOperacion(TipoConDesgloseType value) {
            this.desgloseTipoOperacion = value;
        }

    }

}
