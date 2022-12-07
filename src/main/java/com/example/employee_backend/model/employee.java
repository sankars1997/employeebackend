package com.example.employee_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeadd")
public class employee {



    @Id
    @GeneratedValue
    private int id;
    private  String name;
    private  String designation;
    private int salary;
    private String companyname;
    private int mobileno;
    private String username;
    private String password;


    public employee() {
    }

    public employee(int empcode, String name, String designation, int salary, String companyname, int mobileno, String username, String password) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.companyname = companyname;
        this.mobileno = mobileno;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setEmpcode(int empcode) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
