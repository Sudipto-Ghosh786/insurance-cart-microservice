package com.example.handler;

import com.example.model.AddPolicyToCartRequest;
import com.example.model.AddPolicyToCartResponse;
import com.example.model.DeletePolicyFromCartRequest;
import com.example.model.DeletePolicyFromCartResponse;

public interface InsuranceCartHandler {
    public abstract AddPolicyToCartResponse addPolicyToCart(final AddPolicyToCartRequest addPolicyToCartRequest);
    public abstract DeletePolicyFromCartResponse deletePolicyFromCart(final DeletePolicyFromCartRequest deletePolicyFromCartRequest);
}
