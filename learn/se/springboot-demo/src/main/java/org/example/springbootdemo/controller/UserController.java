package org.example.springbootdemo.controller;

import jakarta.servlet.http.HttpSession;
import org.example.springbootdemo.entity.User;
import org.example.springbootdemo.interceptor.LoginInterceptor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/login")
    public Object login(User user, HttpSession session) {
        System.out.println("登录成功");

        session.setAttribute("user",user);
        session.setMaxInactiveInterval(2 * 60 * 60);
        return "登陆成功";
    }

    @RequestMapping("/get")
    public Object getUser(@RequestHeader String user, @CookieValue String name, @SessionAttribute String password) {
        return LoginInterceptor.CURRENT_USER.get();
    }
}
