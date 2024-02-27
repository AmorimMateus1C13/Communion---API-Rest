package com.mateusAmorim.CommunionBackEnd.dtos;

import com.mateusAmorim.CommunionBackEnd.models.ProductModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class ProductDTO {

    private List<ProductModel> productList;

    public ProductDTO(List<ProductModel> productList) {
        this.productList = productList;
    }
}
