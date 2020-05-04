package com.patterns;

import com.patterns.builder.LunchOrder;
import com.patterns.builder.LunchOrder.Builder;
import com.patterns.singleton.DBSingleton;

public class Main {

    public static void main(String[] args) {
        // Singleton Demo
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        // Builder Demo
        Builder builder = new Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Ham");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }

}
