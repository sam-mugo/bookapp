package com.booky.backend.books;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;

import com.booky.backend.author.Author;
import com.booky.backend.categories.Category;
import com.booky.backend.photo.Photo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "book")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    private Long isbn;
    private Integer totalPages;
    private Double rating;
    private Date publishedDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    private Photo photo;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_categories",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Collection<Category> categories;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_authors",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Collection<Author> authors;
    
}
