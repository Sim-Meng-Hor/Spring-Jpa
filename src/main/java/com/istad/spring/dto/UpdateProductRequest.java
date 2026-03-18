package com.istad.spring.dto;

import java.math.BigDecimal;

public record UpdateProductRequest(
        String code,
        BigDecimal price
) {
}
