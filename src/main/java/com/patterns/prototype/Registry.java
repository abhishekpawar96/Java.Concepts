package com.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<String, Item>();

    public Item createItem (String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    public Registry() {
        loadItems();
    }

    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.22);
        movie.setUrl("movies/3552");
        movie.setDuration("2 Hrs");

        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basic Book");
        book.setPrice(19.99);
        book.setUrl("books/1223");
        book.setNumberOfPages(349);

        items.put("Book", book);

    }
}
