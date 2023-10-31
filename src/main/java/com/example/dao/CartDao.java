package com.example.dao;

import com.example.entity.Cart;
import com.example.model.DeletePolicyFromCartRequest;

public interface CartDao {
    public abstract void saveItemToCart(final Cart cart);
    public abstract void updateItemInCart(final Cart updatedCart);
    public abstract void deleteItemFromCart(final Integer userId, final Integer policyId);
}
