package com.istad.spring.dto;

import java.math.BigDecimal;

public record CreateProductRequest(
        String name,
        BigDecimal price
) {
}
