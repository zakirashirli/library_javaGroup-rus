package com.library.dea.model;

public class Book {
    private String title;
    private String author;
    private Double price;

    // constructor
    public Book(String title, String author, Double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }
}
