package com.example.carbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class Demo {

    @GetMapping("/world")
    public String hello(){
        return "Hello K8s";
    }
}
