package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {


    Optional<ProductModel> findById(Long id);

    List<ProductModel> findByProductName(String productName);

    List<ProductModel> findByProductIsPriced(Boolean productIsPriced);

    List<ProductModel> findByProductPrice(Double productPrice);
}
