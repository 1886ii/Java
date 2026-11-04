package org.example.springbootdemo.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.springbootdemo.entity.User;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    public static final ThreadLocal<User> CURRENT_USER= new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.setStatus(401);
            response.getWriter().write("{\"code\":401,\"msg\":\"未登录，请先登录\"}");
            return false;
        }

        User user = (User) session.getAttribute("user");
        if (user == null) {
            response.setStatus(401);
            response.getWriter().write("{\"code\":401,\"msg\":\"登录已失效\"}");
            session.invalidate();
            return false;
        }

        long now = System.currentTimeMillis();
        long lastAccess = session.getLastAccessedTime();
        int maxSec = session.getMaxInactiveInterval();
        long remain = maxSec - (now - lastAccess)/1000;
        System.out.println("session剩余闲置秒数：" + remain);


        CURRENT_USER.set(user);
        return true;
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        CURRENT_USER.remove();
    }
}
