package com.booky.backend.author;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.booky.backend.books.Book;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id;
 
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private Date birthDate;

    @ManyToMany(mappedBy = "authors")
    private Collection<Book> books;
    
}
