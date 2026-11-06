package org.dev.app.products.dto;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ProductRequest(

        @NotBlank(message = "El nombre es obligatorio")
        String name,
        @Size(max = 150, message = "La description no puede exceder 150 caracteres")
        String description,

        @NotNull(message = "El precio es obligatorio")
        @DecimalMin(value = "0.0", inclusive = false, message = "El precio debe ser mayor a 0.0")
        @Digits(integer = 10, fraction = 2, message = "El precio admite máximo 8 enteros y 2 decimales")
        BigDecimal price,

        @NotNull(message = "El stock es obligatorio")
        @PositiveOrZero(message = "El stock no puede ser negativo")
        Integer stock,

        @NotNull(message = "La categoria es obligatoria")
        Long categoryId,

        Boolean active // Opcional: permite al admin activar o desactivar productos

) {
}
