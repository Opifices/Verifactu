package com.verifactu.service.security;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;

@Service
@Slf4j
public class KeyStoreReloadService {

    @Value("${verifactu.cert.path}")
    private String certPath;

    @Value("${verifactu.cert.password}")
    private String certPassword;

    private KeyStore keyStore;
    private long lastModifiedTime = 0;

    @PostConstruct
    public void init() {
        reloadKeyStore();
    }

    // @Scheduled eliminado para evitar inconsistencia con WebServiceTemplate
    // (Singleton).
    // Para rotar certificados, se requiere reinicio del servicio.

    private synchronized void reloadKeyStore() {
        try (FileInputStream fis = new FileInputStream(certPath)) {
            KeyStore ks = KeyStore.getInstance("PKCS12");
            ks.load(fis, certPassword.toCharArray());
            this.keyStore = ks;
            this.lastModifiedTime = new File(certPath).lastModified();
            log.info("KeyStore cargado correctamente al inicio.");
        } catch (Exception e) {
            log.error("Error crítico cargando KeyStore: ", e);
        }
    }

    public synchronized KeyStore getKeyStore() {
        return this.keyStore;
    }
}
