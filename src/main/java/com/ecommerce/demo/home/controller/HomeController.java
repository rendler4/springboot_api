package com.ecommerce.demo.home.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class HomeController {

    // @PostMapping(value = "home")
    @GetMapping(value = "home")
    public String home(){
        return "Welcome from secure endpoint";
    }
}
