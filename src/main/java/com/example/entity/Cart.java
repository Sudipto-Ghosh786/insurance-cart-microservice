package com.example.entity;

import com.example.model.Policy;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart {
    @Id
    @GeneratedValue
    private Integer cartId;
    private Integer userId;
    private Policy policyDetail;
}

