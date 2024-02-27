package com.mateusAmorim.CommunionBackEnd.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

@Getter
@Setter
@Entity
@Table(name = "login")
public class LoginModel {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    private String userLogin;

    private String userPassword;

    @OneToOne
    @JoinColumn
    private UserModel userModel;

    public LoginModel() {}

    public LoginModel(String userLogin, String userPassword, UserModel userModel) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userModel = userModel;
    }
}
