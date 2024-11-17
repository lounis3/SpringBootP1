package com.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.model.Book;
import com.company.service.BookService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        //TODO: process POST request
        return bookService.addBook(book);
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Long id) {
        Optional<Book> book = bookService.getBookById(id);
        return book.orElse(null);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        //TODO: process PUT request
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id); 
    }
    
    
    

}
