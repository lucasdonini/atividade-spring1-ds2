package com.ds2.atv1.domain;

public class InvalidAmountException extends IllegalArgumentException {
    public InvalidAmountException() {
        super("Amount must be grater than or equal to 0");
    }
}
