package com.mateusAmorim.CommunionBackEnd.dtos;

import com.mateusAmorim.CommunionBackEnd.models.BankListModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BankListDTO {

    private List<BankListModel> bankListModel;

    public BankListDTO(List<BankListModel> bankListModel) {
        this.bankListModel = bankListModel;
    }
}
