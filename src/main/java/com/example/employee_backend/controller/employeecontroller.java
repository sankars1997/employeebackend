package com.example.employee_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class employeecontroller{

    @GetMapping("/")
    public String Homepage(){


        return "welcome to my homepage";
    }

@GetMapping("/add")
public  String add(){
return "add employee";
}

@GetMapping("/view")
public String view(){
return "viewing employee";


}
    @GetMapping("/search")
    public String search(){
        return "search ";


    } @GetMapping("/delete")
    public String delete(){
        return "delete";


    } @GetMapping("/edit")
    public String edit(){
        return "edit";


    }
}