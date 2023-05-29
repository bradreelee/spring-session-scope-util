package com.example.SessionScopeUtil.controller;

import com.example.SessionScopeUtil.model.LoginRequestVO;
import com.example.SessionScopeUtil.util.SessionScopeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping(value="login")
    public String login(@RequestBody LoginRequestVO loginRequestVO) {
        if("brad".equals(loginRequestVO.getUserId())) {
            SessionScopeUtil.setContextSession("sample session value");
            return "login success";
        }

        return "login fail";
    }

    @GetMapping(value = "/test")
    public String testApi() {
        return "test";
    }
}
