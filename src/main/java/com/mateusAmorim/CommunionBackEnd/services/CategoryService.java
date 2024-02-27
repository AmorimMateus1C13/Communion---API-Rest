package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.dtos.CategoryDTO;
import com.mateusAmorim.CommunionBackEnd.models.CategoryModel;
import com.mateusAmorim.CommunionBackEnd.repositories.CategoryRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundIDException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public CategoryDTO getCategoryComplete() {
        CategoryDTO objc = new CategoryDTO(categoryRepository.findAll());
        return objc;
    }
    public CategoryModel getCategoryById(Long id) {
        Optional<CategoryModel> objc = categoryRepository.findById(id);
        return objc.orElseThrow(() -> new ResourceNotFoundIDException(id));
    }

    public CategoryModel getCategoryByName(String categoryName) {
        Optional<CategoryModel> objc = categoryRepository.findByCategoryName(categoryName);
        return  objc.orElseThrow(() -> new ResourceNotFoundNameException(categoryName));
    }
}
