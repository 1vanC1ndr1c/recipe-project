package com.ic.recipeproject.services;

import com.ic.recipeproject.commands.RecipeCommand;
import com.ic.recipeproject.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
