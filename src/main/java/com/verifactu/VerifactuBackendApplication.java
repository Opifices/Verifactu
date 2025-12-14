package com.verifactu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Punto de entrada principal para el microservicio Verifactu.
 * 
 * <p>Habilita explícitamente:
 * <ul>
 *   <li>{@link EnableRetry}: Para el manejo robusto de fallos de red con la AEAT.</li>
 *   <li>{@link EnableScheduling}: Para los trabajos en segundo plano (reintentos asíncronos).</li>
 * </ul>
 * 
 * @author Senior Developer
 * @version 1.0
 */
@SpringBootApplication
@EnableRetry
@EnableScheduling
public class VerifactuBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerifactuBackendApplication.class, args);
	}

}
