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
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String userName;

    @OneToOne(mappedBy = "userModel")
    @JsonIgnore
    private LoginModel loginModel;

    private String userCpf;

    private String title;

    @OneToOne
    @JoinColumn
    private CustomerAddressModel customerAddressModel;

    @OneToMany(mappedBy = "advertiser")
    @JsonIgnore
    private List<ProductModel> products = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "userOwner")
    private List<CustomerBankDetailsModel> bankDetails = new ArrayList<>();

    public UserModel() {}

    public UserModel(String userName, String userCpf, String title, CustomerAddressModel customerAddressModel) {
        this.userName = userName;
        this.userCpf = userCpf;
        this.title = title;
        this.customerAddressModel = customerAddressModel;
    }
}
