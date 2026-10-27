package com.cjaid.springboot.cruddemo.dao;

import com.cjaid.springboot.cruddemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
