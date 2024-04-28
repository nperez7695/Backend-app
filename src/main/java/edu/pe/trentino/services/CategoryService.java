package edu.pe.trentino.services;

import edu.pe.trentino.dto.CategoryDto;
import edu.pe.trentino.entidad.Category;

import java.util.List;

public interface CategoryService {
    void createCategory(CategoryDto categoryDto);

    List<Category> findAllCategories();
}
