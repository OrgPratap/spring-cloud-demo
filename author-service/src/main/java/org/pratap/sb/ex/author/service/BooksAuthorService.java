package org.pratap.sb.ex.author.service;

import lombok.extern.slf4j.Slf4j;
import org.pratap.sb.ex.author.model.BooksAuthor;
import org.pratap.sb.ex.author.repository.BooksAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BooksAuthorService {

    @Autowired
    private BooksAuthorRepository booksAuthorRepository;

    public List<BooksAuthor> getAllAuthors(){
        return booksAuthorRepository.getAllAuthors();
    }

    public BooksAuthor getSpecificAuthor(String authorId){
        return booksAuthorRepository.getSpecificAuthor(authorId);
    }

    public  BooksAuthor updateBooksAuthor(BooksAuthor booksAuthor){
        BooksAuthor tempBooksAuthor = getSpecificAuthor(booksAuthor.getAuthorId());
        if(null==tempBooksAuthor) tempBooksAuthor=new BooksAuthor();
        tempBooksAuthor.setAuthorId(booksAuthor.getAuthorId());
        tempBooksAuthor.setAuthorName(booksAuthor.getAuthorName());
        tempBooksAuthor.setAuthorBookId(booksAuthor.getAuthorBookId());
        return booksAuthorRepository.updateBooksAuthor(tempBooksAuthor);
    }
}
