package com.example.dao;

import com.example.entity.Cart;

public interface CartDao {
    public abstract void saveCart(final Cart cart);
    public abstract void updateCart(final Cart updatedCart);
    public abstract void deleteCart(final Integer cartId);
}
