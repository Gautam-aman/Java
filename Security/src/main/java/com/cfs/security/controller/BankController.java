package com.cfs.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    int bal = 1000;
    @GetMapping("/balance")
    public int getbalance(){
        return bal;
    }

    @PostMapping("/update")
    public int updatebalance(@RequestParam String AccN0 ,@RequestParam int balance){
        return bal +=balance;
    }

}
