package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class employeecontroller{

    @GetMapping("/")
    public String Homepage(){


        return "welcome to my homepage";
    }


}