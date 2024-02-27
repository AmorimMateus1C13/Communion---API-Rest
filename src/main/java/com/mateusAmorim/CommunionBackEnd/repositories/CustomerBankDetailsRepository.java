package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.models.CustomerBankDetailsModel;
import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerBankDetailsRepository extends JpaRepository<CustomerBankDetailsModel, Long> {

    Optional<CustomerBankDetailsModel> findById(Long id);
    Optional<CustomerBankDetailsModel> findByAccountAgency(Integer accountAgency);
    Optional<CustomerBankDetailsModel> findByAccountNumber(Integer accountNumber);

    Optional<CustomerBankDetailsModel> findByUserOwner(UserModel userOwner);

}
