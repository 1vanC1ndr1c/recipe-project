package com.ic.recipeproject.services;

import com.ic.recipeproject.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * Created by Ivan Cindric for recipe-project
 * 26-Oct-18
 * 13:00
 **/
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
