package com.patterns;

import com.patterns.abstact.factory.CardType;
import com.patterns.abstact.factory.CreditCard;
import com.patterns.abstact.factory.CreditCardFactory;
import com.patterns.abstact.factory.Validator;
import com.patterns.adapter.EmployeeClient;
import com.patterns.bridge.*;
import com.patterns.builder.LunchOrder;
import com.patterns.factory.Website;
import com.patterns.factory.WebsiteFactory;
import com.patterns.factory.WebsiteType;
import com.patterns.prototype.Book;
import com.patterns.prototype.Registry;
import com.patterns.singleton.DBSingleton;

public class Main {

    public static void main(String[] args) {

        // Singleton Demo
        System.out.println("============= SINGLETON DEMO =============");
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);

        // Builder Demo
        System.out.println("============= BUILDER DEMO =============");
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
        System.out.println("============= PROTOTYPE DEMO =============");
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

        // Factory Method
        System.out.println("============= FACTORY METHOD DEMO =============");
        Website shoppingWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Website bloggingWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(shoppingWebsite.getPages());
        System.out.println(bloggingWebsite.getPages());

        // Abstract Factory Method
        System.out.println("============= ABSTRACT FACTORY METHOD DEMO =============");
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard amexCard = abstractFactory.getCreditCard(CardType.PLATINUM);
        Validator amexValidator = abstractFactory.getValidator(CardType.PLATINUM);
        System.out.println(amexCard);
        System.out.println(amexValidator);
        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard visaCard = abstractFactory.getCreditCard(CardType.GOLD);
        Validator visaValidator = abstractFactory.getValidator(CardType.GOLD);
        System.out.println(visaCard);
        System.out.println(visaValidator);

        // Adapter Method
        System.out.println("============= ADAPTER DEMO =============");
        EmployeeClient employeeClient = new EmployeeClient();
        System.out.println(employeeClient.getEmployees());

        // Bridge Method
        System.out.println("============= BRIDGE DEMO =============");
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");
        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);
        System.out.println(moviePrinter.print(printFormatter));
    }

}
