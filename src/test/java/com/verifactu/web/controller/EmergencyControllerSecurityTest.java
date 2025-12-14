package com.verifactu.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@org.springframework.test.context.ActiveProfiles("test")
public class EmergencyControllerSecurityTest {

    @org.springframework.boot.test.mock.mockito.MockBean
    private com.verifactu.service.security.KeyStoreReloadService keyStoreReloadService;

    // SoapClientConfig depends on it, preventing context load if missing or failing

    @org.springframework.boot.test.mock.mockito.MockBean
    private com.verifactu.service.security.SignatureService signatureService;

    @org.springframework.boot.test.mock.mockito.MockBean
    private com.verifactu.service.core.XmlGeneratorService xmlGeneratorService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void unauthenticatedUserShouldGet401() throws Exception {
        mockMvc.perform(post("/admin/emergency/seed-chain")
                .param("hash", "dummyHash"))
                .andExpect(status().isUnauthorized()); // 401
    }

    @Test
    @WithMockUser(username = "user", roles = { "USER" })
    public void simpleUserShouldGet403() throws Exception {
        mockMvc.perform(post("/admin/emergency/seed-chain")
                .param("hash", "dummyHash"))
                .andExpect(status().isForbidden()); // 403 (Tiene login pero nó rol ADMIN)
    }

    @Test
    @WithMockUser(username = "admin", roles = { "ADMIN" })
    public void adminUserShouldBeAllowed() throws Exception {
        String jsonBody = """
                {
                    "serie": "TEST",
                    "numero": "001",
                    "lastHash": "dummyHash"
                }
                """;

        mockMvc.perform(post("/admin/emergency/seed-chain")
                .contentType(org.springframework.http.MediaType.APPLICATION_JSON)
                .content(jsonBody))
                .andExpect(status().isOk());
    }
}
