package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class LoginUnavailable extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public LoginUnavailable() {
        super(("Esse login já está sendo usado por outro usuário"));
    }
}
