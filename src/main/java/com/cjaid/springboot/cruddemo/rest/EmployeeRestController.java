package com.cjaid.springboot.cruddemo.rest;

import com.cjaid.springboot.cruddemo.dao.EmployeeDAO;
import com.cjaid.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    // Inject EmployeeDao
    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    // Expose "/employees" and return a list of Employee
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
