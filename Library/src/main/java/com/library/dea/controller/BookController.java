package com.library.dea.controller;

import com.library.dea.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBook() {
        return List.of(
                new Book("Spring for begginers", "Mirali", 99.99),
                new Book("Sherlock Homes", "Aylin", 200.0),
                new Book("Rich Dad and Poor Dad", "Mirali", 99.99),
                new Book("Sidney Sheldon", "Shaxriyar", 400.0)
        );
    }
}
