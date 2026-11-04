package org.example.springbootdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.example.springbootdemo.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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

    @PostMapping("/object")
    public Object getObjectAndOther(Student student, String password) {
        return student.toString() + password;
    }

    @PostMapping("/json")
    public Object getJSON(@RequestBody Student s) {
        return s;
    }

    @RequestMapping("/url/{id}")
    public Object getURLParam(@PathVariable Integer id) {
        return id;
    }

    @RequestMapping("/file")
    public Object getFile(MultipartFile file) throws IOException {
        file.transferTo(new File("D:"));
        return file.getName();
    }

    @RequestMapping("/cookie")
    public Object getCookie(@CookieValue("name")String name) {
        return name;
    }

    @RequestMapping("/session")
    public Object getSession(HttpServletRequest request) {
        HttpSession session = request.getSession(true);  // true表示没有获取到session就创建一个 无参默认true
        session.setAttribute("name",new Student());

        Object name = session.getAttribute("name");
        return name;
    }
}
