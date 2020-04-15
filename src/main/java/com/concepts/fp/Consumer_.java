package com.concepts.fp;

import com.concepts.util.examples.Customer;

import java.util.function.Consumer;

public class Consumer_ {

    public static Consumer<Customer> greetCustomer =
            c -> System.out.println(greetCustomer(c));

    public static String greetCustomer(Customer c) {
        return String.format(
                "Hello, %s " +
                        "thanks for registering with phone number: %s.",
                c.getName(),
                c.getPhoneNumber());
    }

}
