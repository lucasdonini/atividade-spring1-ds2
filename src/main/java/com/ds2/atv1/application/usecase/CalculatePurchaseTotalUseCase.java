package com.ds2.atv1.application.usecase;

import org.springframework.stereotype.Service;

import com.ds2.atv1.domain.InvalidAmountException;
import com.ds2.atv1.domain.Product;

@Service
public class CalculatePurchaseTotalUseCase {

    public double execute(Product product, double amount) {
        if (amount <= 0) {
            throw new InvalidAmountException();
        }

        var discount = amount > 10 ? 0.05 : 0.0;
        return product.price * amount * (1 - discount);
    }
    
}
