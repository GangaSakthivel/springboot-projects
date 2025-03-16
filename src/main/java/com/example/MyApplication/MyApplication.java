package com.example.MyApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}

@RestController
@RequestMapping("/api")
class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Ganga! Welcome to Spring Boot!";
    }
}
