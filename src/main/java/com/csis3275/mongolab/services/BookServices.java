package com.csis3275.mongolab.services;

import com.csis3275.mongolab.dao.BookDAO;
import com.csis3275.mongolab.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServices {

    @Autowired
    private BookDAO BD;

    public Collection<Book> getBooks()
    {
        return BD.getBooks();
    }

    public Book createBook(Book book)
    {
        return BD.insert(book);
    }
}
