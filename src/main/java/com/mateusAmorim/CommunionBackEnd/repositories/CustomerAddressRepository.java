package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddressModel, Long> {

    Optional<CustomerAddressModel> findById(Long id);
    Optional<CustomerAddressModel> findByCustomerTower(Integer customerTower);
    Optional<CustomerAddressModel> findByCustomerApart(Integer customerApart);


}
