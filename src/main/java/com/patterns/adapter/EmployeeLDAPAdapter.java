package com.patterns.adapter;

public class EmployeeLDAPAdapter implements Employee {

    private final EmployeeLDAP employeeLDAP;

    public EmployeeLDAPAdapter(EmployeeLDAP employeeLDAP) {
        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "\t" +
               "FirstName: " + getFirstName() + "\t" +
               "LastName: " + getLastName() + "\t" +
               "Email: " + getEmail();
    }

}
