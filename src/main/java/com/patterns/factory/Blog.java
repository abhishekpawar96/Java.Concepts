package com.patterns.factory;

import com.patterns.factory.pages.About;
import com.patterns.factory.pages.Comment;
import com.patterns.factory.pages.Contact;
import com.patterns.factory.pages.Post;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new Post());
        pages.add(new About());
        pages.add(new Comment());
        pages.add(new Contact());
    }

    @Override
    public String toString() {
        return "Blog Website consist of: " + pages.toString();
    }

}
