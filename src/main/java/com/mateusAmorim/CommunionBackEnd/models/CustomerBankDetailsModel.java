package com.mateusAmorim.CommunionBackEnd.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "CustomerBankDetails")
public class CustomerBankDetailsModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private Boolean mainAccount;
    private Integer accountAgency;
    private Integer accountNumber;

    @ManyToOne
    @JoinColumn(name = "customerBank")
    private BankListModel customerBank;

    @ManyToOne
    @JoinColumn(name = "userOwner")
    private UserModel userOwner;

    public CustomerBankDetailsModel() {}

    public CustomerBankDetailsModel(
            Boolean mainAccount,
            Integer accountAgency,
            Integer accountNumber,
            BankListModel customerBank,
            UserModel userOwner) {
        this.mainAccount = mainAccount;
        this.accountAgency = accountAgency;
        this.accountNumber = accountNumber;
        this.customerBank = customerBank;
        this.userOwner = userOwner;
    }
}
