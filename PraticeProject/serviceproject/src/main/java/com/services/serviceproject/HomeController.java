 package com.services.serviceproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to your Spring Boot app!";
    }
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
} 
