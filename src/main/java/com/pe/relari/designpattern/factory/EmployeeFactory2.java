package com.pe.relari.designpattern.factory;

import com.pe.relari.designpattern.EmployeeService;
import com.pe.relari.designpattern.singleton.impl.EmployeeServiceImpl;
import com.pe.relari.util.GenderCatalog;

public class EmployeeFactory2 {

    private EmployeeFactory2() {}

    public static EmployeeService getInstance(GenderCatalog value) {
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
