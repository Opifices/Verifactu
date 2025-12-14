package com.verifactu;

import com.optifices.replay4j.junit.ReplayTest;
import com.verifactu.model.RegistroAlta;
import com.verifactu.service.core.InvoiceChainerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
public class ReplayChaosTest {

    @Autowired
    private InvoiceChainerService chainerService;

    @MockBean
    private com.verifactu.service.security.SignatureService signatureService;

    @MockBean
    private com.verifactu.service.core.XmlGeneratorService xmlGeneratorService;

    @org.junit.jupiter.api.BeforeEach
    void setup() {
        org.mockito.Mockito.when(signatureService.firmarXml(org.mockito.ArgumentMatchers.anyString()))
                .thenReturn("<Signed>REPLAY</Signed>");
        org.mockito.Mockito.when(xmlGeneratorService.generarXmlAlta(
                org.mockito.ArgumentMatchers.any(),
                org.mockito.ArgumentMatchers.anyString(),
                org.mockito.ArgumentMatchers.anyString()))
                .thenReturn("<Xml>REPLAY</Xml>");
    }

    @Test
    @ReplayTest(source = "Chaos Invoice Generation")
    void testChaosResilience() {
        // This test runs under Replay4j agent control
        // If Replay4j is active, random seeds are deterministic.

        System.out.println("Running Chaos Test with Replay4j...");

        RegistroAlta alta = new RegistroAlta(
                "CHAOS", "001", LocalDate.now(), BigDecimal.TEN, BigDecimal.ZERO, BigDecimal.ZERO,
                Collections.emptyList(), "NIF", "Name", "C_NIF", "C_Name", "F1", null, "PREV_HASH");

        var result = chainerService.encadenarFactura(alta);
        assertNotNull(result.getId());

        System.out.println("Chaos Invoice ID: " + result.getId());
    }
}
