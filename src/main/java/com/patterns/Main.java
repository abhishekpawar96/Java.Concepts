package com.patterns;

import com.patterns.abstact.factory.CardType;
import com.patterns.abstact.factory.CreditCard;
import com.patterns.abstact.factory.CreditCardFactory;
import com.patterns.abstact.factory.Validator;
import com.patterns.adapter.EmployeeClient;
import com.patterns.bridge.*;
import com.patterns.builder.LunchOrder;
import com.patterns.composite.Menu;
import com.patterns.composite.MenuItem;
import com.patterns.decorator.DressingDecorator;
import com.patterns.decorator.MeatDecorator;
import com.patterns.decorator.Sandwich;
import com.patterns.decorator.SimpleSandwich;
import com.patterns.factory.Website;
import com.patterns.factory.WebsiteFactory;
import com.patterns.factory.WebsiteType;
import com.patterns.flyweight.Inventory;
import com.patterns.prototype.Book;
import com.patterns.prototype.Registry;
import com.patterns.singleton.DBSingleton;

public class Main {

    private static String banner(String pattern){
        final String decorator = "=============";
        return decorator + " " + pattern.toUpperCase() + " DEMO " + decorator;
    }

    // Singleton Demo
    private static void singletonDemo() {
        System.out.println(banner("SINGLETON"));
        DBSingleton instance = DBSingleton.getInstance();
        System.out.println(instance);
    }

    // Builder Demo
    private static void builderDemo() {
        System.out.println(banner("BUILDER"));
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
    }

    // Prototype Demo
    private static void prototypeDemo() {
        System.out.println(banner("PROTOTYPE"));
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

    // Factory Demo
    private static void factoryDemo() {
        System.out.println(banner("FACTORY"));
        Website shoppingWebsite = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        Website bloggingWebsite = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        assert shoppingWebsite != null;
        System.out.println(shoppingWebsite.getPages());
        assert bloggingWebsite != null;
        System.out.println(bloggingWebsite.getPages());
    }

    // Abstract Factory Demo
    private static void abstractFactoryDemo() {
        System.out.println(banner("ABSTRACT FACTORY"));
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
    }

    // Adapter Demo
    private static void adapterDemo() {
        System.out.println(banner("ADAPTER"));
        EmployeeClient employeeClient = new EmployeeClient();
        System.out.println(employeeClient.getEmployees());
    }

    // Bridge Demo
    private static void bridgeDemo() {
        System.out.println(banner("BRIDGE"));
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");
        Printer moviePrinter = new MoviePrinter(movie);
        Formatter printFormatter = new PrintFormatter();
        System.out.println(moviePrinter.print(printFormatter));
        Formatter htmlFormatter = new HTMLFormatter();
        System.out.println(moviePrinter.print(htmlFormatter));
    }

    // Composite Demo
    private static void compositeDemo() {
        System.out.println(banner("COMPOSITE"));
        Menu mainMenu = new Menu("Main", "/main");
        Menu claimsSubMenu = new Menu("Claims", "/claims");
        MenuItem safetyMainItem = new MenuItem("Safety", "/safety");
        MenuItem personalMenu = new MenuItem("Personal", "/persona");
        mainMenu.add(safetyMainItem);
        mainMenu.add(claimsSubMenu);
        claimsSubMenu.add(personalMenu);
        System.out.println(mainMenu.toString());
    }

    // Decorator Demo
    private static void decoratorDemo() {
        System.out.println(banner("DECORATOR"));
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
    }

    // FlyWeight Demo
    private static void flyweightDemo() {
        System.out.println(banner("FLYWEIGHT"));
        Inventory inventory = new Inventory();
        inventory.takeOrder("Roomba", 221);
        inventory.takeOrder("Bose Headphones", 361);
        inventory.takeOrder("Samsung TV", 432);
        inventory.takeOrder("Samsung TV", 323);
        inventory.takeOrder("Roomba", 563);
        inventory.takeOrder("Bose Headphones", 321);
        inventory.takeOrder("Roomba", 234);
        inventory.takeOrder("Samsung TV", 54);
        inventory.takeOrder("Roomba", 34);
        inventory.takeOrder("Bose Headphones", 365);
        inventory.takeOrder("Samsung TV", 332);
        inventory.takeOrder("Roomba", 456);
        inventory.process();
        System.out.println(inventory.report());
    }

    public static void main(String[] args) {
        singletonDemo();
        builderDemo();
        prototypeDemo();
        factoryDemo();
        abstractFactoryDemo();
        adapterDemo();
        bridgeDemo();
        compositeDemo();
        decoratorDemo();
        flyweightDemo();
    }

}
