package com.mateusAmorim.CommunionBackEnd.controllers;

import com.mateusAmorim.CommunionBackEnd.models.CustomerAddressModel;
import com.mateusAmorim.CommunionBackEnd.models.LoginModel;
import com.mateusAmorim.CommunionBackEnd.models.ProductModel;
import com.mateusAmorim.CommunionBackEnd.models.UserModel;
import com.mateusAmorim.CommunionBackEnd.services.CustomerAddressService;
import com.mateusAmorim.CommunionBackEnd.services.LoginService;
import com.mateusAmorim.CommunionBackEnd.services.ProductService;
import com.mateusAmorim.CommunionBackEnd.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "communion/register")
public class RegisterController {

    @Autowired
    private final UserService userService;

    @Autowired
    private final CustomerAddressService customerAddressService;

    @Autowired
    private final ProductService productService;

    @Autowired
    private final LoginService loginService;

    public RegisterController(UserService userService, CustomerAddressService customerAddressService, ProductService productService, LoginService loginService) {
        this.userService = userService;
        this.customerAddressService = customerAddressService;
        this.productService = productService;
        this.loginService = loginService;
    }

    @RequestMapping(path = "/addProduct")
    public  ResponseEntity<String> createProduct(@RequestBody ProductModel productModel) {
        productService.createProduct(productModel);
        return ResponseEntity.ok().body("Produto adicionado com sucesso");
    }

    @RequestMapping(path = "/createNewUser")
    public ResponseEntity<String> createNewUser(@RequestBody UserModel userModel) {
        System.out.println(userModel);
            userService.createNewUser(userModel);
        return ResponseEntity.ok().body("Criado com sucesso");
    }


    @RequestMapping(path = "/createLogin")
    public ResponseEntity<LoginModel> createLogin(@RequestBody LoginModel loginModel){
        LoginModel objc = loginService.createLogin(loginModel);
        return  ResponseEntity.ok().body(objc);
    }


    @RequestMapping(path = "/makeLogin")
    public ResponseEntity<LoginModel> makeLogin(@RequestBody LoginModel loginModel){
        LoginModel objc = loginService.makeLogin(loginModel);
        return  ResponseEntity.ok().body(objc);
    }

    @RequestMapping(path = "/getLogin/{id}")
    public ResponseEntity<LoginModel> consultLogin(@PathVariable Long id) {
        LoginModel objc = loginService.getLogin(id);
        return ResponseEntity.ok().body(objc);
    }



}
