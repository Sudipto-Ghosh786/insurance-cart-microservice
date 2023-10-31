package com.example.dao;

import com.example.entity.Cart;
import com.example.model.DeletePolicyFromCartRequest;
import com.example.repo.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CartDaoImpl implements CartDao {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public void saveItemToCart(final Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void updateItemInCart(final Cart updatedCart) {

    }

    @Override
    @Transactional
    public void deleteItemFromCart(final Integer userId, final Integer policyId) {
        cartRepository.deleteByPolicyId(userId, policyId);
    }
}
