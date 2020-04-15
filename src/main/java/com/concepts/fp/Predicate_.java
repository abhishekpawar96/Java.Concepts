package com.concepts.fp;

import java.util.function.Predicate;

public class Predicate_ {

    public static Predicate<String> isValidPhoneNumber =
            p -> p.length() == 12;

}
