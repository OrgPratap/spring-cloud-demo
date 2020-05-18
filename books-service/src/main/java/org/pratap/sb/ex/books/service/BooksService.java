package org.pratap.sb.ex.books.service;

import lombok.extern.slf4j.Slf4j;
import org.pratap.sb.ex.books.model.Books;
import org.pratap.sb.ex.books.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Books> getAllListOfBooks(){
        return booksRepository.getAllBooks();
    }

    public Books getBookByBookId(String bookId){
        return booksRepository.getBookByBookId(bookId);
    }

    public Books updateBook(Books books){
        Books tempBook = getBookByBookId(books.getBookId());
        tempBook.setBookAuthorId(books.getBookAuthorId());
        tempBook.setBookId(books.getBookId());
        tempBook.setBookName(books.getBookName());
        tempBook.setBookPrice(books.getBookPrice());
        tempBook.setBookPublishDate(books.getBookPublishDate());
        return booksRepository.updateBooks(tempBook);
    }
}
