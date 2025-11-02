package com.library.dea.model;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Double price;
    private String releaseDate;

    // constructor
    public Book(Integer id,String title, String author, Double price, String releaseDate){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.releaseDate = releaseDate;
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

    public String getReleaseDate(){return releaseDate;}
}
