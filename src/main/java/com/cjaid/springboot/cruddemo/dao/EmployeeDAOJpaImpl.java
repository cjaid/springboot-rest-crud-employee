package com.cjaid.springboot.cruddemo.dao;


import com.cjaid.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    EmployeeDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        // create query
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee", Employee.class);
        // execute query
        List<Employee> employees = query.getResultList();

        // return the results
        return employees;
    }
}
