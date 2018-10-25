package com.ic.recipeproject.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Getter
@Setter
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
