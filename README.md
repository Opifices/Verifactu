# Librería Java VeriFactu (Antifraude / Crea y Crece)

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Licencia](https://img.shields.io/badge/Licencia-Apache%202.0-D22128?style=for-the-badge&logo=apache&logoColor=white)

## 📖 Descripción del Proyecto

Esta librería proporciona una implementación robusta y ligera en Java para la integración de sistemas de facturación en cumplimiento con la normativa española **"VeriFactu"** (Reglamento de la Ley Antifraude y Ley Crea y Crece).

Está diseñada para permitir a los desarrolladores de software de facturación (SIF) integrar de forma ágil la generación de huellas, el encadenamiento de facturas, la firma electrónica avanzada **XAdES-EPES** y la comunicación segura vía **SOAP** con los servicios web de la Agencia Tributaria (AEAT) y las Diputaciones Forales.

### Características Principales

*   **Generación de XML Certificada:** Construcción de ficheros XML (`RegFactuSistemaFacturacion`) estrictamente validados contra los esquemas XSD oficiales.
*   **Encadenamiento Criptográfico (Huella):** Implementación del algoritmo de encadenamiento de registros de alta para garantizar la inalterabilidad, conforme al artículo 8 del reglamento.
*   **Firma Electrónica Avanzada:** Motor de firma **XAdES-EPES** integrado (Enveloped), cumpliendo con la política de firma de la Administración Pública.
*   **Cliente SOAP Automatizado:** Gestión del envío y recepción de respuestas con la AEAT, incluyendo el manejo de errores y reintentos.
*   **Arquitectura Modular:** Diseñada sobre Spring Boot para facilitar su inyección como dependencia o microservicio independiente.

---

## 🚀 Guía de Inicio Rápido

### Requisitos Previos

*   Java Development Kit (JDK) 17 o superior.
*   Apache Maven 3.8+.
*   Certificado digital válido (para pruebas de firma y envío).

### Instalación

Clone el repositorio e instale la librería en su repositorio Maven local:

```bash
git clone https://github.com/su-organizacion/verifactu-java.git
cd verifactu-java
mvn clean install
```

### Configuración

Configure las propiedades esenciales en `application.properties` o mediante variables de entorno:

```properties
# Configuración del Certificado (Keystore PKCS12)
verifactu.security.keystore-path=classpath:certificado_pruebas.p12
verifactu.security.keystore-password=su_contraseña_segura
verifactu.security.certificate-alias=alias_del_certificado

# Entorno AEAT (Preproducción para Desarrollo)
verifactu.aeat.endpoint=https://prewww1.aeat.es/wlpl/TIKE-CONT/ws/SistemaFacturacion/VerifactuSoapV1
```

### Ejemplo de Uso

```java
@Autowired
private VerifactuService verifactuService;

public void emitirFactura() {
    // 1. Crear el objeto de negocio
    RegistroAlta factura = new RegistroAlta(
        "SERIE1", "001", LocalDate.now(), 
        new BigDecimal("100.00"), // Base Imponible
        new BigDecimal("21.00"),  // Cuota IVA
        new BigDecimal("121.00"), // Total
        // ... otros datos requeridos
    );

    // 2. Procesar (Encadenar -> Generar XML -> Firmar -> Enviar)
    ResultadoEnvio resultado = verifactuService.procesarAlta(factura);

    if (resultado.isAceptado()) {
        System.out.println("Factura aceptada con CSV: " + resultado.getCsv());
    } else {
        System.err.println("Error en envío: " + resultado.getError());
    }
}
```

---

## ⚖️ Exención de Responsabilidad (Disclaimer)

> [!IMPORTANT]
> **LEA ATENTAMENTE ANTES DE UTILIZAR ESTE SOFTWARE**

Este software se proporciona como una **herramienta técnica de ayuda al desarrollo** para facilitar la integración con los servicios de VeriFactu. 

**Optifices NO se hace responsable** de:
1.  La **corrección fiscal** de los datos enviados ni del cumplimiento normativo final del software que integre esta librería.
2.  Posibles **sanciones, multas o inspecciones** derivadas de un uso incorrecto, errores en la generación de huellas, o fallos en la comunicación con la AEAT.
3.  La validación legal de los procesos de anulación o rectificación de facturas.

Es **responsabilidad exclusiva del integrador y del usuario final** validar exhaustivamente los envíos en el entorno de pruebas de la AEAT antes de pasar a producción y asegurar el cumplimiento de la normativa vigente (Orden Ministerial y especificaciones técnicas publicadas).

---

## 📄 Licencia

Este proyecto se distribuye bajo la licencia **Apache License 2.0**. Consulte el archivo `LICENSE` para más detalles.

---

**Optifices** - *Ingeniería de Software para la Era Digital*
