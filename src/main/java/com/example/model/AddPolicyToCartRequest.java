package com.example.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddPolicyToCartRequest {
    private Integer userId;
    private Policy policyDetails;
}
