package com.booky.backend.photo;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/photos")
public class PhotoController {

    private final PhotoRepo photoRepo;

    public PhotoController(PhotoRepo photoRepo) {
        this.photoRepo = photoRepo;
    }
    @GetMapping("/all")
    public ResponseEntity getAllPhotos() {
        return ResponseEntity.ok(this.photoRepo.findAll());
    }

    @PostMapping("/add")
    public Photo addPhoto(@Validated @RequestBody Photo photo) {
        return photoRepo.save(photo);
    }
}
