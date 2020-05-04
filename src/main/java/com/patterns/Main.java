package com.patterns;

import com.patterns.builder.LunchOrder;
import com.patterns.prototype.Book;
import com.patterns.prototype.Registry;
import com.patterns.singleton.DBSingleton;

public class Main {

    public static void main(String[] args) {
        // Singleton Demo
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        // Builder Demo
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Ham");
        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

        // Prototype Demo
        Registry registry = new Registry();
        Book book = (Book) registry.createItem("Book");
        book.setTitle("Creational Patterns in Java");
        book.setNumberOfPages(546);
        System.out.println(
                book.getTitle()
                        + " ("
                        + book.getNumberOfPages()
                        + "pages): "
                        + book.getPrice()
        );
        Book anotherBook = (Book) registry.createItem("Book");
        anotherBook.setTitle("Gang Of Four");
        anotherBook.setNumberOfPages(412);
        System.out.println(
                anotherBook.getTitle()
                        + " ("
                        + anotherBook.getNumberOfPages()
                        + "pages): "
                        + anotherBook.getPrice()
        );

    }

}
