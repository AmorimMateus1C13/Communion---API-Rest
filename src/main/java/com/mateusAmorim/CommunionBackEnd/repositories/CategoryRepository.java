package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

    Optional<CategoryModel> findByCategoryName(String categoryName);

    Optional<CategoryModel> findById(Long id);

}
