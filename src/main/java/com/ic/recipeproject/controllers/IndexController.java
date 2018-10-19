package com.ic.recipeproject.controllers;

import com.ic.recipeproject.Repositories.CategoryRepository;
import com.ic.recipeproject.Repositories.UnitOfMeasureRepository;
import com.ic.recipeproject.domain.Category;
import com.ic.recipeproject.domain.UnitOfMeasure;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is " +categoryOptional.get().getId());
        System.out.println("UOM id is "+ unitOfMeasureOptional.get().getId());

        return "index";
    }
}
