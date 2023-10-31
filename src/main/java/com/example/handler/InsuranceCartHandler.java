package com.example.handler;

import com.example.model.AddPolicyToCartRequest;
import com.example.model.AddPolicyToCartResponse;
import com.example.model.DeletePolicyFromCartRequest;
import com.example.model.DeletePolicyFromCartResponse;

public interface InsuranceCartHandler {
    public abstract AddPolicyToCartResponse addPolicyToCart(final Integer userId, final AddPolicyToCartRequest addPolicyToCartRequest);
    public abstract DeletePolicyFromCartResponse deletePolicyFromCart(final Integer userId, final DeletePolicyFromCartRequest deletePolicyFromCartRequest);
}
