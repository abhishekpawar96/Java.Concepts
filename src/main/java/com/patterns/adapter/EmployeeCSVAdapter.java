package com.patterns.adapter;

public class EmployeeCSVAdapter implements Employee {

    private final EmployeeCSV employeeCSV;

    public EmployeeCSVAdapter(EmployeeCSV employeeCSV) {
        this.employeeCSV = employeeCSV;
    }

    @Override
    public String getId() {
        return Integer.toString(employeeCSV.getId());
    }

    @Override
    public String getFirstName() {
        return employeeCSV.getFirstname();
    }

    @Override
    public String getLastName() {
        return employeeCSV.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeCSV.getEmailaddress();
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\t" +
                "FirstName: " + getFirstName() + "\t" +
                "LastName: " + getLastName() + "\t" +
                "Email: " + getEmail();
    }

}
