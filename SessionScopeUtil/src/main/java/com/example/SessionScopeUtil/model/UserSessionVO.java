package com.example.SessionScopeUtil.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class UserSessionVO {

    private String userId;
    private String userName;
}
