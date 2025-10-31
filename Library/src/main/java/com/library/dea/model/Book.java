package com.library.dea.model;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Double price;

    // constructor
    public Book(Integer id,String title, String author, Double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getters
    public Integer getId(){return id;}

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
