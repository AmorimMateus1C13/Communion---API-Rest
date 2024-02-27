package com.mateusAmorim.CommunionBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "bankList")
public class BankListModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String bankName;
    private Integer bankCode;

    @JsonIgnore
    @OneToMany(mappedBy = "customerBank")
    private List<CustomerBankDetailsModel> bankDetailsModelList = new ArrayList<>();

    public BankListModel() {}

    public BankListModel(String bankName, Integer bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }
}
