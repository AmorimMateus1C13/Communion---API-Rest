package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.dtos.CustomerAddressDTO;
import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.repositories.CustomerAddressRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFindListAddressException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundApartException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundIDException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundTowerException;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerAddressService {

    @Autowired
    private final CustomerAddressRepository customerAddressRepository;

    public CustomerAddressService(CustomerAddressRepository customerAddressRepository) {
        this.customerAddressRepository = customerAddressRepository;
    }

    public CustomerAddressDTO getListComplete() {
        CustomerAddressDTO objc = new CustomerAddressDTO(customerAddressRepository.findAll());
        return objc;
    }

    public  CustomerAddressModel getCustomerAddressById(Long id) {
        Optional<CustomerAddressModel> objc = customerAddressRepository.findById(id);
        return objc.orElseThrow(() -> new ResourceNotFoundIDException(id));
    }

    public CustomerAddressModel getCustomerAddressByTower(Integer customerTower) {
        Optional<CustomerAddressModel> objc = customerAddressRepository.findByCustomerTower(customerTower);
        return objc.orElseThrow(() -> new ResourceNotFoundTowerException(customerTower));
    }

    public CustomerAddressModel getCustomerAddressByApart(Integer customerApart) {
        Optional<CustomerAddressModel> objc = customerAddressRepository.findByCustomerApart(customerApart);
        return objc.orElseThrow(() -> new ResourceNotFoundApartException(customerApart));
    }

}
