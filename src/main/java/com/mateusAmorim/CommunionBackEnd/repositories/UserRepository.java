package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    Optional<UserModel> findById(Long id);
    Optional<UserModel> findByUserName(String userName);
    Optional<UserModel> findByUserCpf(String userCpf);
    Optional<UserModel> findByTitle(String title);

    Optional<UserModel> findByCustomerAddressModel(CustomerAddressModel customerAddressModel);
}
