package com.rakesh.microservies.order.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderRequest {
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
