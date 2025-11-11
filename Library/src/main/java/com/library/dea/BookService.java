package com.library.dea;

import com.library.dea.entity.Book;
import com.library.dea.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public String addBook(@RequestBody Book book) {
        if (book.getTitle() == null || book.getTitle().isEmpty()) {
            return "Title does not exist!";
        }
        bookRepository.save(book);
        return "Book added!";
    }


}
