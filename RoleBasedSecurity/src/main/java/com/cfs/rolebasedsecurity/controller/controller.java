package com.cfs.rolebasedsecurity.controller;

import com.cfs.rolebasedsecurity.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    AccountService accountService;

    @GetMapping("/balance")
    public String GetBalance(){
        return accountService.getbalance();
    }

    @PostMapping("/close")
    public String CloseAccount(){
        return accountService.closeAccount();
    }

}
