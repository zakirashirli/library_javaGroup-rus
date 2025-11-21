package com.library.dea.controller;

import com.library.dea.entity.Book;
import com.library.dea.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService booksService;

    public BookController(BookService booksService) {
        this.booksService = booksService;
    }

    // 1 показать все книнги
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}") // 7?
    public Optional<Book> getBookById(@PathVariable Integer id) {
        return booksService.getBookById(id);
    }

    @GetMapping("/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author) {
        return booksService.getBooksByAuthor(author);
    }

    @GetMapping("/search/{word}")
    public List<Book> getBookByTitleContainig(@PathVariable String word) {
        return booksService.getBooksByTitleContaining(word);
    }

    @GetMapping("/price/between/{min}/{max}")
    public List<Book> getBookByBetweenPrice(
            @PathVariable Double min,
            @PathVariable Double max
    ){
        return booksService.getBooksMinMax(min, max);
    }

    // add new books with REST
    @PostMapping("/add")
    public String createBook(@RequestBody Book book) {
        return booksService.addBook(book);
    }

    // update book
    @PutMapping("/update/{id}")
    public String updateBook(@PathVariable Integer id, @RequestBody Book book) {
        return booksService.updateBookById(id, book);
    }

    //delete book
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id) {
        return booksService.deleteBookById(id);
    }

    // check new method
    // JSON on postman
}
