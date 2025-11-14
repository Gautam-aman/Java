package com.cfs.jwt.controller;


import com.cfs.jwt.entity.AuthRequest;
import com.cfs.jwt.entity.UserInfo;
import com.cfs.jwt.service.JwtService;
import com.cfs.jwt.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private UserInfoService service;
    private JwtService jwtService;
    private AuthenticationManager authenticationManager;

    @GetMapping("/home")
    public String Home(){
        return "Welcome to page";
    }

    @PostMapping("/addnewuser")
    public String addNewUser(@RequestBody UserInfo userInfo){
        return service.addUser(userInfo);
    }

    @PostMapping("/generatetoken")
    public String AuthandGetToken(@RequestBody AuthRequest authRequest){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
        );
        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(authRequest.getUsername());
        } else {
            throw new UsernameNotFoundException("Invalid user request!");
        }
    }



}
