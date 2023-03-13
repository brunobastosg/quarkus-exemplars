package com.github.brunobastosg;

public record PersonResponse(
        Integer id,
        String name,
        Short age,
        String role
) {
}
