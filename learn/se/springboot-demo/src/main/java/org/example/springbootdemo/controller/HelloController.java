package org.example.springbootdemo.controller;

import org.example.springbootdemo.entity.Student;
import org.springframework.web.bind.annotation.*;

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

    // 添加注解后 required false 可以指定当前参数不必须传入就是null
    @GetMapping("/bool")
    public Object getBoolean(@RequestParam(value = "_", required = false) Boolean flag){
        return flag;
    }

    @GetMapping("/int")
    public Object getInt(int a) {
        return "" + a;
    }

    @GetMapping("/object")
    public Object getObjectAndOther(Student student, String password) {
        return student.toString() + password;
    }

}
