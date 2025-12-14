package com.verifactu.util;

import com.verifactu.model.RegistroAlta;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.format.DateTimeFormatter;
import java.util.HexFormat;
import java.util.Locale;

/**
 * Utilidad CRÍTICA para la generación de la Huella Verifactu según Orden
 * HAC/1177/2024.
 * <p>
 * El formato de la huella es: SHA-256 de una cadena concatenada específica.
 * <br>
 * <b>Orden de Concatenación (Alta):</b>
 * <ol>
 * <li>ID Emisor (NIF)</li>
 * <li>Num. Serie (Si existe)</li>
 * <li>Num. Factura</li>
 * <li>Fecha Expedición (dd-MM-yyyy)</li>
 * <li>Importe Total (Con 2 decimales, separador punto, sin control de
 * miles)</li>
 * <li>Tipo de Huella ("01" para Alta)</li>
 * <li>Huella Anterior (Todo mayúsculas)</li>
 * ... (Otros campos según casuística, simplificado aquí para caso base)
 * </ol>
 * </p>
 */
@UtilityClass
@Slf4j
public class VerifactuHashUtil {

    private static final String TIPO_HUELLA_ALTA = "01"; // Valor fijo para registros de Alta
    private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /**
     * Genera la huella SHA-256 para un registro de Alta.
     *
     * @param registro       Datos del registro.
     * @param huellaAnterior Hash del registro previo en la cadena (o vacío si es el
     *                       primero).
     * @return Hexadecimal del SHA-256 (64 caracteres, lowercase o uppercase según
     *         norma, normalmente UPPER).
     */
    public static String generarHuellaAlta(RegistroAlta registro, String huellaAnterior) {
        // 1. Normalización de datos
        String nif = registro.nifEmisor().toUpperCase().trim();
        String serie = registro.serieFactura() == null ? "" : registro.serieFactura().trim();
        String numero = registro.numeroFactura().trim();
        String fecha = registro.fechaExpedicion().format(DATE_FMT);

        // Importe: 2 decimales, punto decimal, sin separador de miles.
        // Ejemplo: 1234.50
        String importe = registro.importeTotal()
                .setScale(2, RoundingMode.HALF_UP)
                .toString()
                .replace(",", "."); // Asegurar punto decimal si el locale fuera ES

        String p_huellaAnterior = huellaAnterior == null ? "" : huellaAnterior.trim().toUpperCase();

        // 2. Concatenación (Orden Estricto)
        // ID_EMISOR & NUM_SERIE & NUM_FACTURA & FECHA & IMPORTE & TIPO_HUELLA &
        // HUELLA_ANTERIOR
        StringBuilder sb = new StringBuilder();
        sb.append("IDEmisor=").append(nif).append("&");
        sb.append("NumSerie=").append(serie).append("&");
        sb.append("NumFactura=").append(numero).append("&");
        sb.append("FechaExpedicion=").append(fecha).append("&");
        sb.append("ImporteTotal=").append(importe).append("&");
        sb.append("TipoHuella=").append(TIPO_HUELLA_ALTA).append("&");
        sb.append("HuellaAnterior=").append(p_huellaAnterior);

        String cadenaAHashar = sb.toString();
        log.debug("Cadena para Hash (Debug): [{}]", cadenaAHashar);

        // 3. Hashing SHA-256
        return sha256(cadenaAHashar).toUpperCase();
    }

    private static String sha256(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            return HexFormat.of().formatHex(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("SHA-256 no disponible en este entorno Java", e);
        }
    }
}
