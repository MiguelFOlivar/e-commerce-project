package org.dev.app.products.dto;

import java.math.BigDecimal;
// vista para cliente
public record ProductResponse(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stock,
        String category,
        Boolean available
) {
}
