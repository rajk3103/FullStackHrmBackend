package com.fullstack.service;

import com.fullstack.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {

    Employee signUp(Employee employee);

    boolean signIn(String empEmailId, String empPassword);

    Optional<Employee> findById(long empId);

    List<Employee> findAll();

    Employee update(long empId, Employee employee);

    void deleteById(long empId);

    void deleteAll();
}
