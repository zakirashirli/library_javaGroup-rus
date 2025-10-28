package com.library.dea.controller;

import com.library.dea.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public Book getBook() {
        return new Book("Spring for begginers", "Mirali");
    }
}
