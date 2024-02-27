package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.dtos.CategoryDTO;
import com.mateusAmorim.CommunionBackEnd.models.CategoryModel;
import com.mateusAmorim.CommunionBackEnd.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "communion/category")
public class CategoryController {

    @Autowired
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(path = "/getCategoryComplete")
    public ResponseEntity<CategoryDTO> getCategoryComplete() {
        CategoryDTO objc = categoryService.getCategoryComplete();
        return  ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getById/{id}")
    public ResponseEntity<CategoryModel> getCategoryById(@PathVariable Long id) {
        CategoryModel objc = categoryService.getCategoryById(id);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getByName/{categoryName}")
    public ResponseEntity<CategoryModel> getCategoryByName(@PathVariable String categoryName) {
        CategoryModel objc = categoryService.getCategoryByName(categoryName);
        return  ResponseEntity.ok().body(objc);
    }
}
