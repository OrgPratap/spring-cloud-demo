package org.pratap.sb.ex.books.controller;

import lombok.extern.slf4j.Slf4j;
import org.pratap.sb.ex.books.model.Books;
import org.pratap.sb.ex.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RefreshScope
@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping(value = "/books/getallbooks")
    public List<Books> getAllBooks(){
        return booksService.getAllListOfBooks();
    }

    @GetMapping(value = "/books/getbooks/{bookId}")
    public Books getAllBooks(@PathVariable("bookId") String bookId ){
        return booksService.getBookByBookId(bookId);
    }

    @PostMapping(value = "/books/updatebooks")
    public Books saveOrUpdateBooks(@RequestBody Books books){
        return booksService.updateBook(books);
    }

}
