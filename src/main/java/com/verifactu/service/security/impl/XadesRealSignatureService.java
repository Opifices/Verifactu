package com.verifactu.service.security.impl;

import com.verifactu.service.security.SignatureService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.io.StringWriter;
import java.security.cert.X509Certificate;
import java.util.List;

import xades4j.providers.impl.FileSystemKeyStoreKeyingDataProvider;
import xades4j.providers.KeyingDataProvider;
import xades4j.production.XadesBesSigningProfile;
import xades4j.production.XadesSigner;
import xades4j.production.Enveloped;
import xades4j.properties.DataObjectDesc;
import xades4j.production.DataObjectReference; // Import correcto
import xades4j.production.SignedDataObjects;
import xades4j.algorithms.EnvelopedSignatureTransform;

@Service
@Primary
@Slf4j
@RequiredArgsConstructor
public class XadesRealSignatureService implements SignatureService {

    @Value("${verifactu.cert.path}")
    private String certPath;

    @Value("${verifactu.cert.password}")
    private String certPassword;

    @Override
    public String firmarXml(String xmlContent) {
        log.info("Iniciando firma XAdES-BES...");
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlContent)));
            Element elementoAFirmar = doc.getDocumentElement();

            KeyingDataProvider kp = new FileSystemKeyStoreKeyingDataProvider(
                    "pkcs12",
                    certPath,
                    new FirstCertificateSelector(),
                    new DirectPasswordProvider(certPassword),
                    new DirectPasswordProvider(certPassword),
                    true);

            XadesBesSigningProfile profile = new XadesBesSigningProfile(kp);
            XadesSigner signer = profile.newSigner();

            // SOLUCIÓN: Usar DataObjectReference que es la implementación concreta
            DataObjectDesc objDesc = new DataObjectReference("");
            objDesc.withTransform(new EnvelopedSignatureTransform());

            signer.sign(new SignedDataObjects(objDesc), elementoAFirmar);

            return convertDocumentToString(doc);

        } catch (Exception e) {
            log.error("Error crítico firmando XML", e);
            throw new RuntimeException("Error firma XAdES", e);
        }
    }

    private static class FirstCertificateSelector
            implements xades4j.providers.impl.KeyStoreKeyingDataProvider.SigningCertSelector {
        @Override
        public X509Certificate selectCertificate(List<X509Certificate> availableCertificates) {
            return availableCertificates.isEmpty() ? null : availableCertificates.get(0);
        }
    }

    private static class DirectPasswordProvider
            implements xades4j.providers.impl.KeyStoreKeyingDataProvider.KeyStorePasswordProvider,
            xades4j.providers.impl.KeyStoreKeyingDataProvider.KeyEntryPasswordProvider {
        private String password;

        public DirectPasswordProvider(String password) {
            this.password = password;
        }

        public char[] getPassword() {
            return password.toCharArray();
        }

        public char[] getPassword(String alias, X509Certificate cert) {
            return password.toCharArray();
        }
    }

    private String convertDocumentToString(Document doc) {
        try {
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            StringWriter writer = new StringWriter();
            transformer.transform(new javax.xml.transform.dom.DOMSource(doc),
                    new javax.xml.transform.stream.StreamResult(writer));
            return writer.getBuffer().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
