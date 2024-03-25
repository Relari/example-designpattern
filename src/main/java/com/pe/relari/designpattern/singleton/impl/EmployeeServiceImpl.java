package com.pe.relari.designpattern.singleton.impl;

import com.pe.relari.model.Employee;
import com.pe.relari.repository.EmployeeRepository;
import com.pe.relari.designpattern.EmployeeService;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

public class EmployeeServiceImpl implements EmployeeService {

    private static final List<Employee> employees = EmployeeRepository.employees();
    private static final AtomicInteger id = new AtomicInteger(employees.size());

    private static final String CLASS_NAME = EmployeeServiceImpl.class.getSimpleName();

    private static final Logger log = Logger.getLogger(CLASS_NAME);

    private EmployeeServiceImpl() {}

    private static EmployeeService instance = null;

    public static EmployeeService getInstance() {
        if (instance == null) {
            log.info("Creando nueva instancia.");
            instance = new EmployeeServiceImpl();
        }
        log.info("Retornando instancia creada.");
        return instance;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void removeEmployee(Integer id) {
        String sb = "Eliminando el empleado con el ID = " + id;
        log.info(sb);
        employees.removeIf(employee -> employee.getId().equals(id));
    }

    @Override
    public void addEmployee(Employee employee) {
        log.info("Agregado al nuevo empleado.");
        employee.setId(id.incrementAndGet());
        employees.add(employee);
    }

    @Override
    public Employee searchEmployee(Integer id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee Not Found"));
    }
}
