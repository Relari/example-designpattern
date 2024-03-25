package com.pe.relari.designpattern.singleton;

import com.pe.relari.designpattern.EmployeeService;
import com.pe.relari.designpattern.singleton.impl.EmployeeServiceImpl;
import com.pe.relari.model.Employee;
import com.pe.relari.util.GenderCatalog;
import com.pe.relari.util.PositionCatalog;

public class EmployeeSingletonApp {

    public static void main(String[] args) {

        EmployeeService employeeService = EmployeeServiceImpl.getInstance();

        employeeService.getEmployees().forEach(System.out::println);

        employeeService.removeEmployee(2);

        Employee employee = Employee.builder()
                .name("Daniel")
                .sex(GenderCatalog.M)
                .age(20)
                .status(Boolean.TRUE)
                .position(PositionCatalog.DEVELOPER)
                .salary(1200)
                .build();

        employeeService.addEmployee(employee);

        EmployeeService employeeService1 = EmployeeServiceImpl.getInstance();

        employeeService1.getEmployees().forEach(System.out::println);

    }

}
