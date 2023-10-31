package com.example.controller;

import com.example.handler.InsuranceCartHandler;
import com.example.model.AddPolicyToCartRequest;
import com.example.model.AddPolicyToCartResponse;
import com.example.model.DeletePolicyFromCartRequest;
import com.example.model.DeletePolicyFromCartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/insurance/cart")
public class AppController {

    @Autowired
    private InsuranceCartHandler insuranceCartHandler;

    @PostMapping("/addPolicyToCart/{userId}")
    public AddPolicyToCartResponse addPolicyToCart(@RequestParam final Integer userId,
        @RequestBody final AddPolicyToCartRequest addPolicyToCartRequest) {
        return insuranceCartHandler.addPolicyToCart(userId, addPolicyToCartRequest);
    }

    @DeleteMapping("/deletePolicyFromCart/{userId}")
    public DeletePolicyFromCartResponse deletePolicyFromCart(@RequestParam final Integer userId,
        @RequestBody final DeletePolicyFromCartRequest deletePolicyFromCartRequest) {
        return insuranceCartHandler.deletePolicyFromCart(userId, deletePolicyFromCartRequest);
    }
}
