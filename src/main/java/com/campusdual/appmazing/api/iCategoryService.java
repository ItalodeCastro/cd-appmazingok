package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.CategoryDto;

import java.util.List;

public interface iCategoryService {
    List<CategoryDto> queryAllCategories();
    CategoryDto queryCategory(CategoryDto categoryDto);

    int insertCategory(CategoryDto categoryDto);
    int updateCategory(CategoryDto categoryDto);
    int deleteCategory(CategoryDto categoryDto);
}
