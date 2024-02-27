package com.mateusAmorim.CommunionBackEnd.repositories;

import com.mateusAmorim.CommunionBackEnd.models.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface LoginRepository extends JpaRepository<LoginModel, Long> {

    Optional<LoginModel> findByUserLogin(String userLogin);

    Optional<LoginModel> findByUserPassword(String userPassword);
}
