package com.example.employee_backend.Dao;

import com.example.employee_backend.model.employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<employee,String> {
    @Query(value = "SELECT `id`, `companyname`, `designation`, `mobileno`, `name`, `password`, `salary`, `username` FROM `employeeadd` WHERE `name`=:name",nativeQuery = true)
    List<employee>SearchEmployee(@Param("name") String name);

}
