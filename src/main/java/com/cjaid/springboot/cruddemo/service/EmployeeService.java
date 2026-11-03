package com.cjaid.springboot.cruddemo.service;

import com.cjaid.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
