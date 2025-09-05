package com.cfs.rolebasedsecurity.Service;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @PreAuthorize("hasRole('USER')")
    public String getbalance(){
        return "Your balance is 1000k";
    }

    @PreAuthorize("hasRole('ADMIN')")
    public String closeAccount(){
        return "Account Closed";
    }

}
