package com.example.SessionScopeUtil.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class LoginRequestVO {

    private String userId;
}
