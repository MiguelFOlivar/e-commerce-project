package org.dev.app.products.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
// Vista completa para admin
public record ProductAdminResponse(
        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stock,
        Boolean active,
        Long categoryId,
        String category,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
