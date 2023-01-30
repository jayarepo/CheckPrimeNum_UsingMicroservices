package com.example.micro1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class Microservice1_controller {
    @Value("${prime.value}")
    private int primeValue;

    @GetMapping("/getdata")
    public int sendValue(){
        return primeValue;
    }
}
