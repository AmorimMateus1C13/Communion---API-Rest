package com.mateusAmorim.CommunionBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Category")
public class CategoryModel {


    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String categoryName;

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<ProductModel> productList = new ArrayList<>();
    public CategoryModel() {}

    public CategoryModel(String categoryName, List<ProductModel> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }
}
