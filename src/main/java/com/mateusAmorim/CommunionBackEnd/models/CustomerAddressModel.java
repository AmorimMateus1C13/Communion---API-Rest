package com.mateusAmorim.CommunionBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Getter
@Setter
@Entity
@Table(name ="CustomerAddress")
public class CustomerAddressModel {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private  Integer customerTower;
    private Integer customerApart;

    @OneToOne(mappedBy = "customerAddressModel")
    @JsonIgnore
    private UserModel userModel;

    public CustomerAddressModel() {}

    public CustomerAddressModel(Integer customerTower, Integer customerApart) {
        this.customerTower = customerTower;
        this.customerApart = customerApart;
    }

}
