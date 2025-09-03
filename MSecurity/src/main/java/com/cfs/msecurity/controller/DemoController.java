package com.cfs.msecurity.controller;


import com.cfs.msecurity.Dots.UserListRequest;
import com.cfs.msecurity.Dots.UserRequest;
import com.cfs.msecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Autowired
    UserService service;

    @GetMapping("/addusers")
    public String AddUser(@RequestBody List<UserRequest> request){
         service.saveUsers(request);
        return "User Added Successfully";
    }

    @GetMapping("/user")
    public String usermethod(){
        return "usermethod";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/pubic")
    public String pubicmethod(){
        return "pubicmethod";
    }
}
