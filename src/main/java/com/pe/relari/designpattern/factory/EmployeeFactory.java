package com.pe.relari.designpattern.factory;

import com.pe.relari.designpattern.EmployeeService;
import com.pe.relari.util.GenderCatalog;

public interface EmployeeFactory {

    EmployeeService getEmployees(GenderCatalog gender);

}
