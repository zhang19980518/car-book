package com.example.carbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @GetMapping("/world")
    public String hello(){
        return "Hello K8s";
    }
}
