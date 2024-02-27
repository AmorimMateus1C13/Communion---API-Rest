package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.dtos.CustomerAddressDTO;
import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.services.CustomerAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "communion/address")
public class CustomerAddressController {

    @Autowired
    private final CustomerAddressService customerAddressService;

    public CustomerAddressController(CustomerAddressService customerAddressService) {
        this.customerAddressService = customerAddressService;
    }

    @GetMapping(path = "/getList")
    public ResponseEntity<CustomerAddressDTO> getAddressList() {
        CustomerAddressDTO objc = customerAddressService.getListComplete();
        return ResponseEntity.ok().body(objc);
    }

    @GetMapping(path = "/getById/{id}")
    public ResponseEntity<CustomerAddressModel> getAddressById(@PathVariable Long id){
        CustomerAddressModel objc = customerAddressService.getCustomerAddressById(id);
        return  ResponseEntity.ok().body(objc);
    }

    @GetMapping(path = "/byTower/{customerTower}")
    public  ResponseEntity<CustomerAddressModel> getAddressByCustomerTower(
            @PathVariable Integer customerTower) {
       CustomerAddressModel objc = customerAddressService.getCustomerAddressByTower(customerTower);
       return  ResponseEntity.ok().body(objc);
    }

    @GetMapping(path = "/byApart/{customerApart}")
    public  ResponseEntity<CustomerAddressModel> getAddressByApart(@PathVariable Integer customerApart) {
        CustomerAddressModel objc =  customerAddressService.getCustomerAddressByApart(customerApart);
        return  ResponseEntity.ok().body(objc);
    }

}
