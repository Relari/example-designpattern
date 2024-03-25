package com.pe.relari.repository;

import com.pe.relari.model.Employee;
import com.pe.relari.util.GenderCatalog;
import com.pe.relari.util.PositionCatalog;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EmployeeRepository {

    public static List<Employee> employees() {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Daniel", 19, GenderCatalog.M, PositionCatalog.DEVELOPER, 1809, true));
        employees.add(new Employee(2, "Maria", 33, GenderCatalog.F, PositionCatalog.ARCHITECT, 2403, true));
        employees.add(new Employee(3, "Juan", 20, GenderCatalog.M, PositionCatalog.SCRUM_MASTER, 3452, false));
        employees.add(new Employee(4, "Esther", 18, GenderCatalog.F, PositionCatalog.DEVELOPER, 3168, false));
        employees.add(new Employee(5, "Luis", 30, GenderCatalog.M, PositionCatalog.ARCHITECT, 2921, true));
        employees.add(new Employee(6, "Stephany", 25, GenderCatalog.F, PositionCatalog.MANAGER, 3773, false));
        employees.add(new Employee(7, "Lucho", 28, GenderCatalog.M, PositionCatalog.MANAGER, 3078, false));
        employees.add(new Employee(8, "Talia", 22, GenderCatalog.F, PositionCatalog.ARCHITECT, 2510, true));
        employees.add(new Employee(9, "Alexander", 31, GenderCatalog.M, PositionCatalog.MANAGER, 3860, true));
        employees.add(new Employee(10, "Lucero", 25, GenderCatalog.F, PositionCatalog.TEAM_LEAD, 3948, false));

        return employees;
    }

}
