package com.patterns.factory;

import com.patterns.factory.pages.Cart;
import com.patterns.factory.pages.Contact;
import com.patterns.factory.pages.Item;
import com.patterns.factory.pages.Search;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new Cart());
        pages.add(new Item());
        pages.add(new Search());
        pages.add(new Contact());
    }

    @Override
    public String toString() {
        return "Shop Website consist of: " + pages.toString();
    }

}
