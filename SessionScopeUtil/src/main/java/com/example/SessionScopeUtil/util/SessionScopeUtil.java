package com.example.SessionScopeUtil.util;

import com.example.SessionScopeUtil.model.UserSessionVO;
import lombok.experimental.UtilityClass;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

@UtilityClass
public class SessionScopeUtil {

    private static String SESSION_KEY = "SESSION_KEY";

    private static void setReqeustContext(String name, Object value) {
        RequestContextHolder.getRequestAttributes().setAttribute(name, value, RequestAttributes.SCOPE_SESSION);
    }

    private static Object getReqeustContext(String name) {
        return RequestContextHolder.getRequestAttributes().getAttribute(name,RequestAttributes.SCOPE_SESSION);
    }

    public static UserSessionVO getContextSession(String name) {
        return (UserSessionVO) getReqeustContext(name);
    }

    public static void setContextSession(Object value) {
        setReqeustContext(SESSION_KEY, value);
    }
}
