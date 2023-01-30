package com.example.micro2.controller;

import com.example.micro2.Entity.Microservice2;
import com.example.micro2.service.Microservice2_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
@RequestMapping("api")
public class Microservice2_Controller {

    @Autowired
    private Microservice2_Service microservice2Service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/passedValue")
    public String receivedValueForPrimeNo(){
        Microservice2 name = restTemplate.exchange("http://localhost:8081/api/getdata", HttpMethod.GET,null, Microservice2.class).getBody();
        return microservice2Service.primeNumber(name.getNum());
    }
}






