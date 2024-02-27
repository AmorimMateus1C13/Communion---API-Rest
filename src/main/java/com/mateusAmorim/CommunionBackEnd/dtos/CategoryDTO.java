package com.mateusAmorim.CommunionBackEnd.dtos;

import com.mateusAmorim.CommunionBackEnd.models.CategoryModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter public class CategoryDTO {

    private List<CategoryModel> categoryList;

    public CategoryDTO(List<CategoryModel> categoryList) {
        this.categoryList = categoryList;
    }
}
