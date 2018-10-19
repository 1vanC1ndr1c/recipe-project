package com.ic.recipeproject.Repositories;

import com.ic.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository  extends CrudRepository<Category, Long> {
}
