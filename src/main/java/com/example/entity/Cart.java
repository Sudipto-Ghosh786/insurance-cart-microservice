package com.example.entity;

import com.example.model.Policy;
import lombok.Builder;

import javax.persistence.Entity;
import java.util.List;

@Entity
@Builder
public class Cart {
    private Integer cartId;
    private Integer userId;
    private List<Policy> listOfPolicy;
}

