package com.rakesh.microservies.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class productResponse {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
