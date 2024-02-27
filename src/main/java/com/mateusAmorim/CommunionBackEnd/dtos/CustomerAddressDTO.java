package com.mateusAmorim.CommunionBackEnd.dtos;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
public class CustomerAddressDTO {

    @Autowired
    private List<CustomerAddressModel> addresList;

    public CustomerAddressDTO(List<CustomerAddressModel> addresList) {
        this.addresList = addresList;
    }
}
