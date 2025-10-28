package com.library.dea.model;

public class Book {
    private String title;
    private String author;

    // constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
