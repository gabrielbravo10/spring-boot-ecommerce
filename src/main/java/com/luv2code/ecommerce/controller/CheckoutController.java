package com.luv2code.ecommerce.controller;

import com.luv2code.ecommerce.dto.PurchaseDto;
import com.luv2code.ecommerce.dto.PurchaseResponseDto;
import com.luv2code.ecommerce.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponseDto placeOrder(@RequestBody PurchaseDto purchaseDto) {
        PurchaseResponseDto purchaseResponseDto = checkoutService.placeOrder(purchaseDto);
        return purchaseResponseDto;
    }
}
