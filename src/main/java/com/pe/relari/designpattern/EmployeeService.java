package com.pe.relari.designpattern;

import com.pe.relari.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getEmployees();

    void removeEmployee(Integer id);

    void addEmployee(Employee employee);

    Employee searchEmployee(Integer id);

}
