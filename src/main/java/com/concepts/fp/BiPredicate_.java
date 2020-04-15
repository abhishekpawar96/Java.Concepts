package com.concepts.fp;

import java.util.function.BiPredicate;

public class BiPredicate_ {

    public static BiPredicate<String, String> isValidCustomer =
            (n, p) -> n.length() <= 10 && p.length() == 12;

}
