package com.ic.recipeproject.services;

import com.ic.recipeproject.commands.IngredientCommand;

/**
 * Created by Ivan Cindric for recipe-project
 * 26-Oct-18
 * 01:00
 **/
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}