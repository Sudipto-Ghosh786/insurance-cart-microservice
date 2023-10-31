package com.example.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AddPolicyToCartResponse {
    private Boolean isPolicyAddedSuccessfully;
}
