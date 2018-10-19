package com.ic.recipeproject.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal amount;

    //private UnitOfMeasure uom;

    //bidirectional
    @ManyToOne//if we delete an ingredient, we don't want to delete recipe
    private Recipe recipe;


}
