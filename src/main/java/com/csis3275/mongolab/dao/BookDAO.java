package com.csis3275.mongolab.dao;

import com.csis3275.mongolab.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository BR;

    public Collection<Book> getBooks()
    {
        return BR.findAll();
    }

    public void createBook(Book book)
    {
        BR.insert(book);
    }

    public Book insert(Book book)
    {
        return BR.insert(book);
    }

}
