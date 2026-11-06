package org.example.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    public int age;
    public String name;

    public Student(int age) {
        this.age = age;
    }
}
