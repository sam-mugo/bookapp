package com.booky.backend.photo;


import com.booky.backend.books.Book;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Long id;

    private String urlSmall;
    private String urlMedium;
    private String urlLarge;

    @OneToOne(mappedBy = "photo")
    private Book book;

    public Photo() {
    }

    public Photo(Long id, String urlSmall, String urlMedium, String urlLarge, Book book) {
        this.id = id;
        this.urlSmall = urlSmall;
        this.urlMedium = urlMedium;
        this.urlLarge = urlLarge;
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlSmall() {
        return urlSmall;
    }

    public void setUrlSmall(String urlSmall) {
        this.urlSmall = urlSmall;
    }

    public String getUrlMedium() {
        return urlMedium;
    }

    public void setUrlMedium(String urlMedium) {
        this.urlMedium = urlMedium;
    }

    public String getUrlLarge() {
        return urlLarge;
    }

    public void setUrlLarge(String urlLarge) {
        this.urlLarge = urlLarge;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
