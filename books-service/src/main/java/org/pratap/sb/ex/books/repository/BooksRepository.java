package org.pratap.sb.ex.books.repository;

import lombok.extern.slf4j.Slf4j;
import org.pratap.sb.ex.books.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class BooksRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Books> getAllBooks() {
        log.info("Get All Books");
        List<Books> tempBookList = mongoTemplate.findAll(Books.class);
        if(null==tempBookList) tempBookList=new ArrayList<>();
        log.info("RETURN : {}",tempBookList);
        return tempBookList;
    }

    public Books getBookByBookId(String bookId) {
        log.info("Get Book By Book ID");
        Query query = new Query();
        query.addCriteria(Criteria.where("bookId").is(bookId));
        Books tempBook = mongoTemplate.findOne(query, Books.class);
        if(null==tempBook) tempBook=new Books();
        log.info("RETURN : {}",tempBook);
        return tempBook;
    }

    public Books updateBooks(Books books) {
        log.info("Update Book");
        Books updatedBooks = mongoTemplate.save(books);
        if (null==updatedBooks) updatedBooks = new Books();
        log.info("RETURN : {}",updatedBooks);
        return updatedBooks;
    }

}
