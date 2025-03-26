package com.example.books.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BooksController {

    @GetMapping("/books")
    public String getBooks() {
        return "List of books";
    }
}
