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
@Table(name = "Product")
public class ProductModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String productName;
    private String productDescription;
    private Boolean productIsPriced;
    private Double productPrice;

    @ManyToOne()
    @JoinColumn()
    private UserModel advertiser;

    @ManyToOne()
    @JoinColumn(name = "category", nullable = false)
    private CategoryModel category;

    public ProductModel() {}

    public ProductModel(String productName, String productDescription,
                        Boolean productIsPriced, Double productPrice,
                        UserModel advertiser, CategoryModel category) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productIsPriced = productIsPriced;
        this.productPrice = productPrice;
        this.category = category;
        this.advertiser = advertiser;
    }

}
