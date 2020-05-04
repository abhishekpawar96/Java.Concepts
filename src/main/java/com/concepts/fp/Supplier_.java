package com.concepts.fp;

import com.concepts.util.examples.Customer;

import java.util.function.Supplier;

public class Supplier_ {

    public static Supplier<Customer> getSampleCustomer =
            () -> Optional_.customer;

    public static Supplier<IllegalStateException> illegalStateException =
            () -> new IllegalStateException("Failed to load Customer");

}
