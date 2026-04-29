package com.ds2.atv1.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Product {
    FRANGO(10),
    PERU(18),
    CHESTER(20);

    public final double price;

    public static Product fromString(String s) {
        try {
            return valueOf(s.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ProductNotFoundException(s);
        }
    }
}
