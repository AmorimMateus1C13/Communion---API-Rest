package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.models.CustomerBankDetailsModel;
import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import com.mateusAmorim.CommunionBackEnd.repositories.CustomerBankDetailsRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.DiferrenceBetweenFieldException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundByAccountNumber;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundByAccountAgency;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundIDException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerBankDetailsService {

    @Autowired
    private CustomerBankDetailsRepository customerBankDetailsRepository;

    public CustomerBankDetailsService(CustomerBankDetailsRepository customerBankDetailsRepository) {
        this.customerBankDetailsRepository = customerBankDetailsRepository;
    }

    public CustomerBankDetailsModel getBankDetailsById(Long id) {
        Optional<CustomerBankDetailsModel> objc = customerBankDetailsRepository.findById(id);
        return objc.orElseThrow(() -> new ResourceNotFoundIDException(id));
    }

    public CustomerBankDetailsModel getBankDetailsByAccountAgency(Integer accountAgency) {
        Optional<CustomerBankDetailsModel> objc = customerBankDetailsRepository.findByAccountAgency(accountAgency);
        return objc.orElseThrow(() -> new ResourceNotFoundByAccountAgency(accountAgency));
    }

    public  CustomerBankDetailsModel getBankDetailsByAccountNumber(Integer accountNumber) {
        Optional<CustomerBankDetailsModel> objc = customerBankDetailsRepository.findByAccountNumber(accountNumber);
        return objc.orElseThrow(() -> new ResourceNotFoundByAccountNumber(accountNumber));
    }

    public CustomerBankDetailsModel getBankDetailsByAgencyAndNumber(Integer accountAgency, Integer accountNumber) {
        CustomerBankDetailsModel byAgency = customerBankDetailsRepository.findByAccountAgency(accountAgency)
                .orElseThrow(() -> new ResourceNotFoundByAccountAgency(accountAgency));
        CustomerBankDetailsModel byNumber = customerBankDetailsRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new ResourceNotFoundByAccountNumber(accountNumber));

        bankDetailsAreTheSame(byAgency, byNumber);
        return byNumber;
    }


    public CustomerBankDetailsModel getBankDetailByUserOwner(UserModel userOwner) {
        CustomerBankDetailsModel byUserOwner = customerBankDetailsRepository.findByUserOwner(userOwner)
                .orElseThrow(() -> new ResourceNotFoundIDException(userOwner.getId()));
        return byUserOwner;
    }
    public void bankDetailsAreTheSame(
            CustomerBankDetailsModel byAgency,
            CustomerBankDetailsModel byNumber) {

        if (!byAgency.equals(byNumber)) {
            throw new DiferrenceBetweenFieldException();
        }
    }
}
