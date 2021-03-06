package com.example.test.secureapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Security";
    }

    @GetMapping("/bye")
    public String bye(){
        return "bye Spring Security";
    }
}
