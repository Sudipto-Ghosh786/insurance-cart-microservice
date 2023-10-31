package com.example.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DeletePolicyFromCartRequest {
	private Integer userId;
    private Integer policyId;
}
