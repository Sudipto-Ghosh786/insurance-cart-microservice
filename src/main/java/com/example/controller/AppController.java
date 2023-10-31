package com.example.controller;

import com.example.handler.InsuranceCartHandler;
import com.example.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insurance/cart")
public class AppController {

    @Autowired
    private InsuranceCartHandler insuranceCartHandler;

    @PostMapping("/addPolicyToCart")
    public AddPolicyToCartResponse addPolicyToCart(@RequestBody final AddPolicyToCartRequest addPolicyToCartRequest) {
        return insuranceCartHandler.addPolicyToCart(addPolicyToCartRequest);
    }

    @DeleteMapping("/deletePolicyFromCart")
    public DeletePolicyFromCartResponse deletePolicyFromCart(@RequestBody final DeletePolicyFromCartRequest deletePolicyFromCartRequest) {
        return insuranceCartHandler.deletePolicyFromCart(deletePolicyFromCartRequest);
    }

    @GetMapping("/createOrder/{userId}")
    public CreateOrderFromCartResponse createOrder(@PathVariable final int userId) {
        insuranceCartHandler.createOrderFromCart(userId);
    }
}
