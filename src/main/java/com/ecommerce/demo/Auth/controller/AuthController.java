package com.ecommerce.demo.Auth.controller;

import com.ecommerce.demo.jwt.AuthResponse;
import com.ecommerce.demo.jwt.AuthService;
import com.ecommerce.demo.jwt.LoginRequest;
import com.ecommerce.demo.jwt.RegisterRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@AllArgsConstructor
public class AuthController {
    @Autowired
    private AuthService authService;



    @PostMapping(value = "login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest request){
      return ResponseEntity.ok(authService.login(request));
    }
    //public String login(){
    //  return "Login from public endpoint";
    //}

    @PostMapping(value = "register")
    public ResponseEntity<AuthResponse> register(@RequestBody RegisterRequest request){

            return ResponseEntity.ok(authService.register(request));


    }
}
