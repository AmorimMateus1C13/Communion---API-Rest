package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import com.mateusAmorim.CommunionBackEnd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "communion/user")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/byId/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long id) {
        UserModel objc = userService.getUserById(id);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/byUserCpf/{userCpf}")
    public ResponseEntity<UserModel> getUserByCpf(@PathVariable String userCpf) {
        UserModel objc = userService.getUserByCpf(userCpf);
        return ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/byUserName/{userName}")
    public ResponseEntity<UserModel> getUserByUserName(@PathVariable String userName) {
        UserModel objc = userService.getUserByUserName(userName);
        return ResponseEntity.ok().body(objc);
    }

}
