package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.dtos.ProductDTO;
import com.mateusAmorim.CommunionBackEnd.models.ProductModel;
import com.mateusAmorim.CommunionBackEnd.repositories.ProductRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundByProductIsPriced;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundNameException;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductModel createProduct(ProductModel productModel) {
        ProductModel objc = productRepository.save(productModel);
        return objc;
    }

    public ProductDTO getProductsComplete() {
        return new ProductDTO(productRepository.findAll());
    }

    public ProductDTO getListOfProductByProductName(String productName) {
        List<ProductModel> objc = productRepository.findByProductName(productName);
        return new ProductDTO(verifyIsListIsEmpty(objc));
    }

    public ProductDTO getListOfProductByProductIsPriced(Boolean productIsPriced) {
        List<ProductModel> objc = productRepository.findByProductIsPriced(productIsPriced);
       return new ProductDTO(verifyIsListIsEmpty(objc));
    }

    public ProductDTO getListOfProductByPrice(Double productPrice) {
        List<ProductModel> objc = productRepository.findByProductPrice(productPrice);
        return new ProductDTO(verifyIsListIsEmpty(objc));
    }

    public List<ProductModel> verifyIsListIsEmpty(List<ProductModel> objc) {
        if (objc.isEmpty()) {
            throw new ResourceNotFoundByProductIsPriced(objc);
        } else {
            return objc;
        }
    }

}
