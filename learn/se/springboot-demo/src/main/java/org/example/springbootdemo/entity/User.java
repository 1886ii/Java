package org.example.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String account;
    private String password;
    private int gender;
    private int garde;
    private String avatar;
}
