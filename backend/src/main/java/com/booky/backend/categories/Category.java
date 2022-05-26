package com.booky.backend.categories;

import com.booky.backend.books.Book;
import lombok.Data;
import java.util.Collection;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String category;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany(mappedBy = "parent")
    private Collection<Category> children;

    @ManyToMany(mappedBy = "categories")
    private Collection<Book> books;
    
}
