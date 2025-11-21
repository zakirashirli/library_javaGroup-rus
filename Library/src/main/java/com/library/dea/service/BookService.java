package com.library.dea.service;

import com.library.dea.entity.Book;
import com.library.dea.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public List<Book> getBooksByAuthor(String author) {
        return bookRepository.findByAuthor(author);
    }
    public List<Book> getBooksByTitleContaining(String word) {
        return bookRepository.findByTitleContaining(word);
    }
    public List<Book> getBooksMinMax(Double min, Double max) {
        return bookRepository.findByPriceBetween(min, max);
    }

    public String addBook(@RequestBody Book newBook) {
        if (newBook.getTitle() == null || newBook.getTitle().isEmpty()) {
            return "Title does not exist!";
        }
        bookRepository.save(newBook);
        return "Book added!";
    }


    public Optional<Book> getBookById(@PathVariable Integer id) {
        return bookRepository.findById(id);
    }

    public String updateBookById(@PathVariable Integer id, @RequestBody Book updatedBook) {
        if (bookRepository.existsById(id)) {
            updatedBook.setId(id); // Kanan -> Nicat
            bookRepository.save(updatedBook);
            return "Book updated!";
        }
        return "Book does not exist!";
    }

    public String deleteBookById(@PathVariable Integer id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return "Book deleted!";
        }
        return "Book does not exist!";
    }

}
