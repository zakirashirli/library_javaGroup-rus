package com.library.dea.repository;

import com.library.dea.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

//    // 1. помогает найти по названию
//    Book findByTitle(String title);

    // 2. найти книги по автору
    List<Book> findByAuthor(String author);

    // 3. найти книги по части названии
    List<Book> findByTitleContaining(String word);

    // 4. найти книги по цене min/max
    List<Book> findByPriceBetween(Double min, Double max);
//
//    // 5. найти книги по дешевле указоной цене
//    List<Book> findByLessThan(Double price);
}
