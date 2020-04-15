package com.concepts.fp;

import com.concepts.util.examples.Customer;

import java.util.function.BiConsumer;

public class BiConsumer_ {

    public static BiConsumer<Customer, Boolean> greetCustomer =
            (c, p) -> System.out.println(greetCustomer(c, p));

    public static String greetCustomer(Customer c, boolean showPhoneNumber) {
        return String.format(
                "Hello, %s " +
                        "thanks for registering with phone number: %s.",
                c.getName(),
                showPhoneNumber ? c.getPhoneNumber() : "***-***-****");
    }

}
