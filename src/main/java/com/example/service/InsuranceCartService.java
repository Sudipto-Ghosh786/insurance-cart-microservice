package com.example.service;

import com.example.entity.Cart;

public interface InsuranceCartService {
    public abstract void saveCartDetails(final Cart cart);
    public abstract void deleteCart(final Integer cartId);
}
