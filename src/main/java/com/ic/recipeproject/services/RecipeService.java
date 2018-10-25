package com.ic.recipeproject.services;

import com.ic.recipeproject.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
