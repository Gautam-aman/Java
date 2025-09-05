package com.cfs.securitycsrf.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private final Map<String , String> userData= new HashMap<>();

    @GetMapping("/public")
    public String publicmethod(){
        return "publicmethod";
    }

    @PostMapping("/adduser")
    public String AddUser(@RequestBody Map<String, String> user){
        userData.put(user.get("username"), user.get("password"));
        return "success";
    }

}
