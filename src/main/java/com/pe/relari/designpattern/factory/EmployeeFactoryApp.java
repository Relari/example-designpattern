package com.pe.relari.designpattern.factory;

import com.pe.relari.designpattern.EmployeeService;
import com.pe.relari.designpattern.factory.impl.EmployeeFactoryImpl;
import com.pe.relari.util.GenderCatalog;

public class EmployeeFactoryApp {

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactoryImpl();

        EmployeeService employeeMaleService = employeeFactory.getEmployees(GenderCatalog.M);

        employeeMaleService.getEmployees().forEach(System.out::println);

        EmployeeService employeeFemaleService = employeeFactory.getEmployees(GenderCatalog.F);

        employeeFemaleService.getEmployees().forEach(System.out::println);

        EmployeeService employeeService = employeeFactory.getEmployees(null);

        employeeService.getEmployees().forEach(System.out::println);

    }
}
