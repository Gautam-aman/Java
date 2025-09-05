package com.cfs.mysqlsecurity.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class usercontroller {

    public String adduser(@RequestBody UserListRequest request){

        return "success";

    }

}
