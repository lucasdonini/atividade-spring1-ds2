package com.ds2.atv1.domain;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String product) {
        super("Product not found: " + product);
    }
}
