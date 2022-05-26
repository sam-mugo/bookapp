package com.booky.backend.books;

import com.booky.backend.author.Author;
import com.booky.backend.photo.Photo;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @GetMapping("/all")
    public ResponseEntity getAllBooks() {
        return ResponseEntity.ok(this.bookRepo.findAll());
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id) {
        return bookRepo.getReferenceById(id);
    }

    @PostMapping("/add")
    public Book addAuthor(@Validated @RequestBody Book book) {
        return bookRepo.save(book);

    }
}
