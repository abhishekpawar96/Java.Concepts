package com.concepts.util.examples;

import java.util.List;

import static com.concepts.util.examples.Customer.Samples.*;

public class Customer {
    private final String name;
    private final String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static List<Customer> samples = List.of(anna, tom, hank, kyle);

    public static Customer random = samples.get(0);

    static class Samples {
        public static final Customer anna = new Customer("Anna", "678-865-4352");
        public static final Customer tom = new Customer("Tom", "894-724-8201");
        public static final Customer hank = new Customer("Hank", "256-552-1033");
        public static final Customer kyle = new Customer("Kyle", "734-192-2735");

    }

}

