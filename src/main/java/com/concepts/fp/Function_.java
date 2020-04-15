package com.concepts.fp;

import java.util.function.Function;

public class Function_ {

    static Function<Integer, Integer> incrementByOne = n -> n + 1;

    static Function<Integer, Integer> multiplyByTen = n -> n * 10;

    public static Function<Integer, Integer> addOneAndThenMultiplyByTen =
            incrementByOne.andThen(multiplyByTen);

}
