package com.concepts.fp;

import java.util.function.BiFunction;

public class BiFunction_ {

    public static BiFunction<Integer, Integer, Integer> addOneAndThenMultiply =
            (n, m) -> (n + 1) * m;

}
