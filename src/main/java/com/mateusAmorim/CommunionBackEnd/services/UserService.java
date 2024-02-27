package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.models.CustomerBankDetailsModel;
import com.mateusAmorim.CommunionBackEnd.models.LoginModel;
import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import com.mateusAmorim.CommunionBackEnd.repositories.UserRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFound;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.ResourceNotFoundIDException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel getUserById(Long id) {
        Optional<UserModel> objc = userRepository.findById(id);
        return objc.orElseThrow(() -> new ResourceNotFoundIDException(id));
    }

    public UserModel getUserByCpf(String userCpf) {
        Optional<UserModel> objc = userRepository.findByUserCpf(userCpf);
        return objc.orElseThrow(() -> new ResourceNotFound(userCpf));
    }

    public UserModel getUserByUserName(String userName) {
        Optional<UserModel> objc = userRepository.findByUserName(userName);
        return objc.orElseThrow(() -> new ResourceNotFound(userName));
    }

    public void createNewUser(UserModel userModel) {

        checkIfUserExistInDatabaseByCpf(userModel);
//        checkIfUserExistInDatabaseByAddress(userModel);

        UserModel newUser = new UserModel(
                userModel.getUserName(),
                userModel.getUserCpf(),
                userModel.getTitle(),
                userModel.getCustomerAddressModel()
        );

        userRepository.save(newUser);
    }

    public void checkIfUserExistInDatabaseByCpf(UserModel userModel) {
        Optional<UserModel> byUserCpf = userRepository.findByUserCpf(userModel.getUserCpf());
        if (byUserCpf.isPresent()) {
            throw new RuntimeException("existe o cliente");
        }
    }

//    public void checkIfUserExistInDatabaseByAddress(UserModel userModel) {
//        Optional<UserModel> byUserAddress = userRepository.findByCustomerAddressModel(userModel.getCustomerAddressModel());
//        if (byUserAddress.isPresent()) {
//            throw new RuntimeException("existe o cliente");
//        }
//    }

//    public void clientExistInDatabase(Optional<UserModel> userModel) {
//        if (userModel.isPresent()) {
//            throw new RuntimeException("existe o cliente");
//        }
//    }
}
