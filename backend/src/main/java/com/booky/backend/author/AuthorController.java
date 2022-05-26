package com.booky.backend.author;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @GetMapping("/all")
    public ResponseEntity getAllAuthors() {
        return ResponseEntity.ok(this.authorRepo.findAll());
    }

    @PostMapping("/add")
    public Author addAuthor(@Validated @RequestBody Author author) {
        return authorRepo.save(author);


    }
}
