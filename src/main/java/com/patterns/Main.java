package com.patterns;

import com.patterns.singleton.DBSingleton;

public class Main {

    public static void main(String[] args) {
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

    }

}
