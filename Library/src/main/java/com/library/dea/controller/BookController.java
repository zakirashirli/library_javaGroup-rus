package com.library.dea.controller;

import com.library.dea.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final List<Book> books = List.of(
            new Book(1,"Spring for begginers", "Mirali", 99.99),
            new Book(2,"Sherlock Homes", "Aylin", 200.0),
            new Book(3,"Rich Dad and Poor Dad", "Mirali", 99.99),
            new Book(4,"Sidney Sheldon", "Shaxriyar", 400.0));

    // 1 показать все книнги
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        for (Book book : books) {
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }
}
