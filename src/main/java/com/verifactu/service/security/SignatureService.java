package com.verifactu.service.security;

/**
 * Servicio encargado de la orquestación de la firma electrónica.
 * <p>
 * Define el contrato para la aplicación de firmas XAdES sobre los documentos
 * XML generados,
 * asegurando el no repudio y la integridad de la información transmitida a la
 * AEAT.
 */
public interface SignatureService {

    /**
     * Genera la firma XAdES-BES para un registro de alta.
     * 
     * @param registro       Datos del registro a firmar.
     * @param huellaAnterior Hash encadenado del registro previo.
     * @return Cadena XML correspondiente a la firma (o al documento firmado
     *         completo).
     * @throws RuntimeException Si falla el proceso criptográfico.
     */
    /**
     * Aplica una firma digital al contenido XML proporcionado.
     * <p>
     * Este método debe implementar la lógica para encapsular el XML en una
     * estructura XAdES (EPES o BES),
     * utilizando el almacén de claves (KeyStore) configurado en la aplicación.
     *
     * @param xmlContent Cadena de texto que contiene el XML original a firmar.
     * @return Cadena de texto con el XML firmado (estructura XAdES completa).
     * @throws RuntimeException Si ocurre algún error durante el proceso de firma
     *                          (ej. certificado no válido, error de parseo).
     */
    String firmarXml(String xmlContent);
}
