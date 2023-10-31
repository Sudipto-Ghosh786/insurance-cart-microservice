package com.example.repo;

import com.example.entity.Cart;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    @Modifying
    @Query("DELETE FROM Cart c WHERE c.userId = :userId AND c.policyDetail.policyId = :policyId")
    public abstract void deleteByPolicyId(@Param("policyId") final Integer userId, @Param("policyId") final Integer policyId);
}
