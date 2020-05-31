package com.patterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployees() {
        List<Employee> employees        = new ArrayList<>();
        Employee       employeeFromDB   = new EmployeeDB("1", "John", "Wick", "john@wick.com");
        EmployeeLDAP   employeeFromLDAP = new EmployeeLDAP("2", "Han", "Solo", "han@solo.com");
        EmployeeCSV    employeeFromCSV  = new EmployeeCSV("3,Sherlock,Holmes,sherlock@homes");
        employees.add(employeeFromDB);
        employees.add(new EmployeeLDAPAdapter(employeeFromLDAP));
        employees.add(new EmployeeCSVAdapter(employeeFromCSV));
        return employees;
    }

}
