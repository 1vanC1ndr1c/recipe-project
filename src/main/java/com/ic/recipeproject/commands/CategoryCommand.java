package com.ic.recipeproject.commands;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * SPring MVC
 *
 * Form will bind properties to commands,
 * and that will be passed to our controllers
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
