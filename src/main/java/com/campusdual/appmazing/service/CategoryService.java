package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.iCategoryService;
import com.campusdual.appmazing.model.Category;
import com.campusdual.appmazing.model.dao.CategoryDao;
import com.campusdual.appmazing.model.dto.CategoryDto;
import com.campusdual.appmazing.model.dto.dtomapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CategoryService")
@Lazy
public class CategoryService implements iCategoryService {
    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<CategoryDto> queryAllCategories() {
        return CategoryMapper.INSTANCE.toDTOList(this.categoryDao.findAll());
    }

    @Override
    public CategoryDto queryCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.INSTANCE.toEntity(categoryDto);
        Category categoryFinal = this.categoryDao.getReferenceById(category.getId());
        return CategoryMapper.INSTANCE.toDTO(categoryFinal);
    }

    @Override
    public int insertCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.INSTANCE.toEntity(categoryDto);
        this.categoryDao.saveAndFlush(category);
        return category.getId();
    }

    @Override
    public int updateCategory(CategoryDto categoryDto) {
        return this.insertCategory(categoryDto);
    }

    @Override
    public int deleteCategory(CategoryDto categoryDto) {
        Category category = CategoryMapper.INSTANCE.toEntity(categoryDto);
        this.categoryDao.delete(category);
        return category.getId();
    }
}
