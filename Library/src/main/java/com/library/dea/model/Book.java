package com.library.dea.model;

public class Book {
    private Integer id;
    private String title;
    private String author;
    private Double price;
    private String releaseDate;

    // constructor
//    public Book(){}

    public Book(Integer id,String title, String author, Double price, String releaseDate){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    //getters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
