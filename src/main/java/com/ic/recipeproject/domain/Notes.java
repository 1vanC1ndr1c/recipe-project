package com.ic.recipeproject.domain;

import lombok.Data;

import javax.persistence.*;

@Data//LOMBOK
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
}
