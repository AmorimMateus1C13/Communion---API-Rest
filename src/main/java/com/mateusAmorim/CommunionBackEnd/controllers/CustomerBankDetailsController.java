package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.models.CustomerBankDetailsModel;
import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import com.mateusAmorim.CommunionBackEnd.services.CustomerBankDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "communion/bankDetails")
public class CustomerBankDetailsController {

    @Autowired
    private final CustomerBankDetailsService customerBankDetailsService;

    public CustomerBankDetailsController(CustomerBankDetailsService customerBankDetailsService) {
        this.customerBankDetailsService = customerBankDetailsService;
    }

    @RequestMapping(path = "/getById/{id}")
    public ResponseEntity<CustomerBankDetailsModel> getBankDetailsById(@PathVariable Long id) {
        CustomerBankDetailsModel objc = customerBankDetailsService.getBankDetailsById(id);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getByAccountAgency/{accountAgency}")
    public ResponseEntity<CustomerBankDetailsModel> getBankDetailsByAccountAgency(@PathVariable Integer accountAgency) {
        CustomerBankDetailsModel objc = customerBankDetailsService.getBankDetailsByAccountAgency(accountAgency);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getByAccountNumber/{accountNumber}")
    public ResponseEntity<CustomerBankDetailsModel> getBankDetailsByAccountNumber(@PathVariable Integer accountNumber) {
        CustomerBankDetailsModel objc = customerBankDetailsService.getBankDetailsByAccountNumber(accountNumber);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getByComparison/accountAgency={accountAgency}&accountNumber={accountNumber}")
    public ResponseEntity<CustomerBankDetailsModel> getBankDetailsByComparison(
            @PathVariable Integer accountAgency,
            @PathVariable Integer accountNumber) {
        CustomerBankDetailsModel objc = customerBankDetailsService.
                getBankDetailsByAgencyAndNumber(accountAgency,accountNumber);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getByUserOwner")
    public ResponseEntity<CustomerBankDetailsModel> getBankByUserOwner(@RequestBody UserModel userOwner) {
        CustomerBankDetailsModel objc = customerBankDetailsService.getBankDetailByUserOwner(userOwner);
        return ResponseEntity.ok().body(objc);
    }

}
