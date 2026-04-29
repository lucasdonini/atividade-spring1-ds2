package com.ds2.atv1.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ds2.atv1.application.usecase.CalculatePurchaseTotalUseCase;
import com.ds2.atv1.domain.Product;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PurchaseController {

    private final CalculatePurchaseTotalUseCase calculateTotalUseCase;

    @GetMapping("/compra")
    public String getPurchaseData(
            @RequestParam String produto,
            @RequestParam(required = false, defaultValue = "1") double quantidade) {

        var product = Product.fromString(produto);
        var total = calculateTotalUseCase.execute(product, quantidade);

        return "Produto: %s | Quantidade: %.1f kg | Total: R$ %.2f"
            .formatted(product.name(), quantidade, total);
    }

}
