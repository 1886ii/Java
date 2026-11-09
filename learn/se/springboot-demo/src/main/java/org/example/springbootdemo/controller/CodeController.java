package org.example.springbootdemo.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.ICaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.core.lang.Console;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/code")
public class CodeController {


    @GetMapping("/get")
    public Object getCode(HttpServletResponse response) throws IOException {
        //定义图形验证码的长和宽
        ICaptcha captcha = CaptchaUtil.createLineCaptcha(200, 100);
        String code = captcha.getCode();
        captcha.write(response.getOutputStream());
        response.getOutputStream().close();
        System.out.println(code);
        return code;
    }
}
