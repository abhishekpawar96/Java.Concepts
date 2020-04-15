package com.concepts.fp;

import com.concepts.util.examples.Customer;

import java.util.Optional;

public class Optional_ {

    public static Customer customer =
            Optional
                    .ofNullable(Customer.random)
                    .orElseThrow(Supplier_.illegalStateException);

}
