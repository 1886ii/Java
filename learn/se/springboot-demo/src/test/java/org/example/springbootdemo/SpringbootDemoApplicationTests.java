package org.example.springbootdemo;

import org.example.springbootdemo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tools.jackson.databind.ObjectMapper;

@SpringBootTest
class SpringbootDemoApplicationTests {

    @Test
    void contextLoads() {
        Student student = new Student();
        student.age = 1;
        student.name = "11";

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(student);

        System.out.println(s);


        Student student1 = objectMapper.readValue(s, Student.class);
        System.out.println(student);
    }

}
