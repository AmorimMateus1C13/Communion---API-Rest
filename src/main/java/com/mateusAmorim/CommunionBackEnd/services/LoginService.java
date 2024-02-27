package com.mateusAmorim.CommunionBackEnd.services;

import com.mateusAmorim.CommunionBackEnd.models.LoginModel;
import com.mateusAmorim.CommunionBackEnd.repositories.LoginRepository;
import com.mateusAmorim.CommunionBackEnd.servicesExceptions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public LoginModel createLogin(LoginModel loginModel) {
        checkIfLoginExist(loginModel);
        return loginRepository.save(loginModel);
    }

    public LoginModel makeLogin(LoginModel loginModel) {
        Optional<LoginModel> byLogin = loginRepository.findByUserLogin(loginModel.getUserLogin());
        Optional<LoginModel> byPassword = loginRepository.findByUserPassword(loginModel.getUserPassword());

        checkIfCredentialsExistInDatabase(byLogin, byPassword);

        return byLogin.orElseThrow(ResourceNotFoundLogin::new);
    }


    public void checkIfCredentialsExistInDatabase(Optional<LoginModel> byLogin, Optional<LoginModel> byPassword) {
        if (byLogin.isPresent() && byPassword.isPresent()) {
            checkIfResultIsTheSame(byLogin, byPassword);
        } else {
            throw new CredentialsWrong();
        }
    }

    public void checkIfResultIsTheSame(Optional<LoginModel> byLogin, Optional<LoginModel> byPassword) {
        if (!byLogin.equals(byPassword)) {
            throw new CredentialsWrong();
        }
    }

    public void checkIfLoginExist(LoginModel loginModel) {
        Optional<LoginModel> byLogin = loginRepository.findByUserLogin(loginModel.getUserLogin());
        if (byLogin.isPresent()){
            throw new LoginUnavailable();
        }
    }

    public LoginModel getLogin(Long id) {
        Optional<LoginModel> objc = loginRepository.findById(id);
        return objc.orElseThrow(() -> new ResourceNotFoundIDException(id));
    }
}
