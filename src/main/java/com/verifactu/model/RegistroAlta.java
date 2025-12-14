package com.verifactu.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record RegistroAlta(
                String serieFactura, // 1
                String numeroFactura, // 2
                LocalDate fechaExpedicion, // 3
                BigDecimal importeTotal, // 4
                BigDecimal baseImponible, // 5 (NUEVO)
                BigDecimal cuotaTotal, // 6 (NUEVO)
                List<DesgloseImpuestos> desglose, // 7 (MOVIDO)
                String nifEmisor, // 8
                String nombreRazonEmisor, // 9
                String nifCliente, // 10
                String nombreRazonCliente, // 11
                String tipoFactura, // 12
                String numeroFacturaRectificada, // 13 (NUEVO)
                String huellaAnterior // 14
) {
        // Constructor compacto para evitar nulos
        public RegistroAlta {
                if (desglose == null)
                        desglose = List.of();
                if (baseImponible == null)
                        baseImponible = BigDecimal.ZERO;
                if (cuotaTotal == null)
                        cuotaTotal = BigDecimal.ZERO;
        }
}
