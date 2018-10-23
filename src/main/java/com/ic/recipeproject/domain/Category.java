package com.ic.recipeproject.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data//LOMBOK annotation
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    //BY doing lombok - we don't need to manually do getters, setters, toString, equals

}
