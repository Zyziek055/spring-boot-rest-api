package com.codewithmosh.store.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    public String name;
    public String description;
    public BigDecimal price;
    public Byte categoryId;
}
