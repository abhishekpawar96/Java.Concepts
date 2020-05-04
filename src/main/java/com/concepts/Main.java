package com.concepts;

import com.concepts.fp.*;
import com.concepts.util.examples.Customer;


public class Main {

    public static void main(String[] args) {

        System.out.println(Function_.addOneAndThenMultiplyByTen.apply(5));

        System.out.println(BiFunction_.addOneAndThenMultiply.apply(3, 6));

        Customer c = Supplier_.getSampleCustomer.get();

        Consumer_.greetCustomer.accept(c);

        BiConsumer_.greetCustomer.accept(c, false);

        System.out.println(Predicate_.isValidPhoneNumber.test(c.getPhoneNumber()));

        System.out.println(BiPredicate_.isValidCustomer.test(c.getName(), c.getPhoneNumber()));

    }
}
