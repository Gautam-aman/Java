package com.cfs.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class student {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello sir welcome";
    }
}
