package com.booky.backend.categories;


import com.booky.backend.photo.Photo;
import com.booky.backend.photo.PhotoRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/categories")
public class CategoriesController {
    private final CategoryRepo categoryRepo;

    public CategoriesController(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }
    @GetMapping("/all")
    public ResponseEntity getAllCategories() {
        return ResponseEntity.ok(this.categoryRepo.findAll());
    }

    @PostMapping("/add")
    public Category addPhoto(@Validated @RequestBody Category category) {
        return categoryRepo.save(category);
    }
}
