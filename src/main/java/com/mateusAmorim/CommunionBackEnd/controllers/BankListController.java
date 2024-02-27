package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.dtos.BankListDTO;
import com.mateusAmorim.CommunionBackEnd.models.BankListModel;
import com.mateusAmorim.CommunionBackEnd.services.BankListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "communion/bankList")
public class BankListController {

    @Autowired
    private final BankListService bankListService;

    public BankListController(BankListService bankListService) {
        this.bankListService = bankListService;
    }

    @GetMapping(value = "/getAllBankList")
    public ResponseEntity<BankListDTO> getBankListComplete() {
        BankListDTO objc = bankListService.getAllBanks();
        return  ResponseEntity.ok().body(objc);
    }

    @GetMapping(value = "/getBankByName/{bankName}")
    public ResponseEntity<BankListModel> getBankByName(@PathVariable String bankName) {
        BankListModel objc = bankListService.getBankByBankName(bankName);
       return ResponseEntity.ok().body(objc);
    }

    @GetMapping(value = "/getBankByCode/{bankCode}" )
    public ResponseEntity<BankListModel> getBankByBankCode(@PathVariable Integer bankCode) {
        BankListModel objc = bankListService.getBankByBankCode(bankCode);
        return  ResponseEntity.ok().body(objc);
    }

    @GetMapping(value = "/getById/{id}")
    public ResponseEntity<BankListModel> getBankById(@PathVariable Long id) {
        BankListModel objc = bankListService.getBankById(id);
        return  ResponseEntity.ok().body(objc);
    }
}
