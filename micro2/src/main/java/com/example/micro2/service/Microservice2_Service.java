package com.example.micro2.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Microservice2_Service {

    public String primeNumber(Integer data){
        int num = data;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag)
            return num + " is a prime number.";
        else
            return num + " is not a prime number.";

    }

}
