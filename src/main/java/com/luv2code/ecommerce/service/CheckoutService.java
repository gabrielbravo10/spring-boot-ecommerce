package com.luv2code.ecommerce.service;

import com.luv2code.ecommerce.dto.PurchaseDto;
import com.luv2code.ecommerce.dto.PurchaseResponseDto;

public interface CheckoutService {

    PurchaseResponseDto placeOrder(PurchaseDto purchaseDto);
}
