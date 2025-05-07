package com.codewithmosh.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UpdateProductRequest {
    public String name;
    public String description;
    public BigDecimal price;
    public Byte categoryId;
}
