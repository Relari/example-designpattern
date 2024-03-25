package com.pe.relari.designpattern.factory.impl;

import com.pe.relari.designpattern.factory.EmployeeFactory;
import com.pe.relari.designpattern.factory.EmployeeFemaleService;
import com.pe.relari.designpattern.factory.EmployeeMaleService;
import com.pe.relari.designpattern.singleton.impl.EmployeeServiceImpl;
import com.pe.relari.designpattern.EmployeeService;
import com.pe.relari.util.GenderCatalog;

public class EmployeeFactoryImpl implements EmployeeFactory {

    @Override
    public EmployeeService getEmployees(GenderCatalog value) {
        switch (value) {
            case M:
                return EmployeeMaleService.getInstance();
            case F:
                return EmployeeFemaleService.getInstance();
            default:
                return EmployeeServiceImpl.getInstance();
        }
    }

}
