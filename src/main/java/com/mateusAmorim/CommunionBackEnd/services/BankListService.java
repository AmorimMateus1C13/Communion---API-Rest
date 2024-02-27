package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.dtos.BankListDTO;
import com.mateusAmorim.CommunionBackEnd.models.BankListModel;
import com.mateusAmorim.CommunionBackEnd.repositories.BankListRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFindBankByBankCodeException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundIDException;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class BankListService {

   private final BankListRepository  bankListRepository;

    @Autowired
    public BankListService(BankListRepository bankListRepository) {
        this.bankListRepository = bankListRepository;
    }

    public BankListDTO getAllBanks() {
        BankListDTO objc = new BankListDTO(bankListRepository.findAll());
        return objc;
    }

    public BankListModel getBankById(Long id) {
        Optional<BankListModel> objc = bankListRepository.findById(id);
        return objc.orElseThrow(() -> new ResourceNotFoundIDException(id));
    }

    public BankListModel getBankByBankName(String bankName) {
        Optional<BankListModel> objc = bankListRepository.findByBankName(bankName);
        return objc.orElseThrow(() -> new ResourceNotFoundNameException(bankName));
    }

    public BankListModel getBankByBankCode(Integer bankCode) {
        Optional<BankListModel> objc = bankListRepository.findByBankCode(bankCode);
        return objc.orElseThrow(() -> new ResourceNotFindBankByBankCodeException(bankCode));
    }

}
