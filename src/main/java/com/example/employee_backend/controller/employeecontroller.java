package com.example.employee_backend.controller;

import com.example.employee_backend.Dao.EmployeeDao;
import com.example.employee_backend.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class employeecontroller{


    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage(){


        return "welcome to my emppage";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/empadd",consumes = "application/json",produces = "application/json")
public HashMap<String, String> add(@RequestBody employee e){
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname().toString());
        System.out.println(e.getMobileno());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
}
@CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<employee>viewall(){
        return (List<employee>) dao.findAll();
}
    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchall",consumes = "application/json",produces ="application/json")
    public  List<employee> SearchEmployee(@RequestBody employee s){
        String name=s.getName();
        System.out.println(s.getName().toString());
        dao.SearchEmployee(s.getName().toString());
        return (List<employee>) dao.SearchEmployee(s.getName());
    }


}