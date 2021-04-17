package com.example.demo.repositories;

import com.example.demo.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-16
 * Time: 12:34
 * Project:demolivebackend
 * Copyright: MIT
 */
@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findByTitle(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByTitleAndAuthor(String title, String author);
}
