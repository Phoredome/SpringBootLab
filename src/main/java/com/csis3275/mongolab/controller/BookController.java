package com.csis3275.mongolab.controller;

import com.csis3275.mongolab.entity.Book;
import com.csis3275.mongolab.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServices BS;

    @GetMapping
    public Collection<Book> getBook()
    {
        return BS.getBooks();
    }

    @PostMapping()
    public Book postBook(@RequestBody Book book)
    {
        return BS.createBook(book);
    }


}
