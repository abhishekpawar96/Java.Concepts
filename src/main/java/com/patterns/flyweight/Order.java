package com.patterns.flyweight;

public class Order {
    private final int number;
    private final Item item;

    Order(int number, Item item) {
        this.number = number;
        this.item = item;
    }

    void process() {
        System.out.println("Ordering " + item  + " for order number " + number);
    }
}
