package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-16
 * Time: 12:45
 * Project:demolivebackend
 * Copyright: MIT
 */
@RestController
@RequestMapping(path = "/book")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path = "/add")
    public String addBook(@RequestParam String title, @RequestParam String author) {
        Book b = new Book();
        b.setAuthor(author);
        b.setTitle(title);

        bookRepository.save(b);
        return " Book was saved";

    }

    @GetMapping(path = "/all")
    public Iterable<Book> addBook() {
        Iterable<Book> list = bookRepository.findAll();
        return list;

    }
}
