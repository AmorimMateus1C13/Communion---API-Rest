package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class CredentialsWrong extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public CredentialsWrong() {
        super(("Login ou senha estão errados"));
    }
}
