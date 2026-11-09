package org.example.springbootdemo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "trail.config")  // 读取配置文件 转为对象 
public class Common {
    private String path;
    private String name;
    private String password;
    private List<String> student;
}
