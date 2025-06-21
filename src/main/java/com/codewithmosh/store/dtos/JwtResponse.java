package com.codewithmosh.store.dtos;

import lombok.Data;

@Data
public class JwtResponse {
    public String token;

    public JwtResponse(String token) {
    }
}
