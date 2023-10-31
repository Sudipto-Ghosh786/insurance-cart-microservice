package com.example.handler;

import com.example.dao.CartDao;
import com.example.entity.Cart;
import com.example.model.AddPolicyToCartRequest;
import com.example.model.AddPolicyToCartResponse;
import com.example.model.DeletePolicyFromCartRequest;
import com.example.model.DeletePolicyFromCartResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceCartHandlerImpl implements InsuranceCartHandler {
    @Autowired
    private CartDao cartDao;

    @Override
    public AddPolicyToCartResponse addPolicyToCart(final AddPolicyToCartRequest addPolicyToCartRequest) {
        cartDao.saveItemToCart(Cart.builder()
                        .userId(addPolicyToCartRequest.getUserId())
                        .policyId(addPolicyToCartRequest.getPolicyDetails().getPolicyId())
                        .policyDetail(addPolicyToCartRequest.getPolicyDetails().toString())
                .build());
        return AddPolicyToCartResponse.builder()
                .isPolicyAddedSuccessfully(Boolean.TRUE).build();
    }

    @Override
    public DeletePolicyFromCartResponse deletePolicyFromCart(final DeletePolicyFromCartRequest deletePolicyFromCartRequest) {
        cartDao.deleteItemFromCart(deletePolicyFromCartRequest.getUserId(), deletePolicyFromCartRequest.getPolicyId());
        return DeletePolicyFromCartResponse.builder().isPolicyDeleteSuccessfully(true).build();
    }
}
