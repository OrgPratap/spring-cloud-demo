package org.pratap.sb.ex.author.controller;

import lombok.extern.slf4j.Slf4j;
import org.pratap.sb.ex.author.model.BooksAuthor;
import org.pratap.sb.ex.author.service.BooksAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RefreshScope
@RestController
public class BooksAuthorController {

    @Autowired
    private BooksAuthorService booksAuthorService;

    @GetMapping("/author/getallauthor")
    public List<BooksAuthor> getAllAuthors(){
        return booksAuthorService.getAllAuthors();
    }

    @GetMapping("/author/getauthor/{authorId}")
    public BooksAuthor getSpecificAuthor(@PathVariable("authorId") String authorId){
        return booksAuthorService.getSpecificAuthor(authorId);
    }

    @PostMapping("/aothor/updateauthor")
    public BooksAuthor updateAuthor(@RequestBody BooksAuthor booksAuthor){
        return booksAuthorService.updateBooksAuthor(booksAuthor);
    }
}
