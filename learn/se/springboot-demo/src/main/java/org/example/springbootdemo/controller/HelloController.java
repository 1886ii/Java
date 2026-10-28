package org.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn")
public class HelloController {
    @GetMapping("/get")
    public Object getRequest(String username) {
        return "你好" + username;
    }

    @RequestMapping(value = "/getAndPost", method = {RequestMethod.GET, RequestMethod.POST})
    public Object getAndPostRequest() {
        return "get | post";
    }

    @GetMapping("/bool")
    public Object getBoolean(Boolean flag){
        return flag;
    }
}
