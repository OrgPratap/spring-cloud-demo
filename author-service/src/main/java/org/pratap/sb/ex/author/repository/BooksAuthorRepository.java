package org.pratap.sb.ex.author.repository;

import lombok.extern.slf4j.Slf4j;
import org.pratap.sb.ex.author.model.BooksAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class BooksAuthorRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<BooksAuthor> getAllAuthors(){
        List<BooksAuthor> listOfBookAuthors = mongoTemplate.findAll(BooksAuthor.class);
        if(null==listOfBookAuthors) listOfBookAuthors=new ArrayList<>();
        return listOfBookAuthors;
    }

    public BooksAuthor getSpecificAuthor(String authorId){
        Query query = new Query();
        query.addCriteria(Criteria.where("authorId").is(authorId));
        BooksAuthor tempAuthor = mongoTemplate.findOne(query,BooksAuthor.class);
        if(null==tempAuthor) tempAuthor = new BooksAuthor();
        return tempAuthor;
    }

    public BooksAuthor updateBooksAuthor(BooksAuthor booksAuthor) {
        BooksAuthor updatedBooksAuthor = mongoTemplate.save(booksAuthor);
        if (null==updatedBooksAuthor) updatedBooksAuthor = new BooksAuthor();
        return updatedBooksAuthor;
    }

}
