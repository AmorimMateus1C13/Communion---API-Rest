package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.dtos.ProductDTO;
import com.mateusAmorim.CommunionBackEnd.models.ProductModel;
import com.mateusAmorim.CommunionBackEnd.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "communion/products")
public class ProductController {

    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/getProductList")
    public ResponseEntity<ProductDTO> getProductComplete() {
        ProductDTO objc = productService.getProductsComplete();
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/byName/{productName}")
    public ResponseEntity<ProductDTO> getProductByName(@PathVariable String productName) {
        ProductDTO objc = productService.getListOfProductByProductName(productName);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/byIsPriced/{productIsPriced}")
    public ResponseEntity<ProductDTO> getListOfProductByIsPriced(@PathVariable Boolean productIsPriced) {
        ProductDTO objc = productService.getListOfProductByProductIsPriced(productIsPriced);
        return  ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/byPrice/{productPrice}")
    public ResponseEntity<ProductDTO> getListOfProductByProductPrice(@PathVariable Double productPrice) {
        ProductDTO objc = productService.getListOfProductByPrice(productPrice);
        return  ResponseEntity.ok().body(objc);
    }
}
