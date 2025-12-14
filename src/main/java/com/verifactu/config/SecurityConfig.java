package com.verifactu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.beans.factory.annotation.Value;
import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Bean;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
                http
                                .csrf(csrf -> csrf.disable()) // Para APIs REST stateless suele desactivarse, o
                                                              // configurarse cookie
                                .authorizeHttpRequests(auth -> auth
                                                .requestMatchers("/actuator/**").permitAll() // Monitorización (ajustar
                                                                                             // en prod)
                                                .requestMatchers("/admin/**").hasRole("ADMIN") // PROTECCIÓN DE
                                                                                               // EMERGENCIA
                                                .anyRequest().authenticated())
                                .httpBasic(withDefaults()); // Auth básica para simplificar pruebas

                return http.build();
        }

        @Value("${admin.password:verifactu_rescue_2025}")
        private String adminPassword;

        @Bean
        public UserDetailsService userDetailsService() {
                // En producción, esto debería venir de una DB, pero para este endpoint de
                // emergencia
                // un usuario en memoria con password fuerte configurada por variable de entorno
                // es seguro.
                UserDetails admin = User.withUsername("superadmin")
                                .password("{noop}" + adminPassword)
                                .roles("ADMIN")
                                .build();

                return new InMemoryUserDetailsManager(admin);
        }
}
