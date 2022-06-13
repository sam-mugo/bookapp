package com.booky.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorDTO {
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    
}
