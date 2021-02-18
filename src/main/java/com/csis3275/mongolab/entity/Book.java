package com.csis3275.mongolab.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection="Book")
public class Book {

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private Integer id;
    private String title, author;
}
