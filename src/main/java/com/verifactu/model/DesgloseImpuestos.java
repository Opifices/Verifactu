package com.verifactu.model;

import java.math.BigDecimal;

public record DesgloseImpuestos(
                BigDecimal baseImponible,
                BigDecimal tipoImpositivo,
                BigDecimal cuota,
                BigDecimal tipoRecargo,
                BigDecimal cuotaRecargo) {
}
