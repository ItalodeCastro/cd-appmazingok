package com.campusdual.appmazing.controller;

import com.campusdual.appmazing.api.iCategoryService;
import com.campusdual.appmazing.model.dto.CategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    iCategoryService CategoryService;

    @GetMapping public String testController(){
        return "Get controller for Category works!";
    }

    @PostMapping
    public String testController(@RequestBody String name){
        return "Post controller works: " + name;
    }

    @PostMapping (value = "/get")
    public CategoryDto queryCategory(@RequestBody CategoryDto category){
        return this.CategoryService.queryCategory(category);
    }

    @GetMapping (value = "/getAll")
    public List<CategoryDto> queryAllCategories(){
        return this.CategoryService.queryAllCategories();
    }

    @PostMapping (value = "/add")
    public int insertCategory(@RequestBody CategoryDto category){
        return this.CategoryService.insertCategory(category);
    }

    @PutMapping (value = "/update")
    public int updateCategory(@RequestBody CategoryDto category){
        return this.CategoryService.updateCategory(category);
    }
    @DeleteMapping (value = "/delete")
    public int deleteCategory (@RequestBody CategoryDto category){
        return this.CategoryService.deleteCategory(category);
    }
}
