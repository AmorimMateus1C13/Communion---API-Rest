package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundLogin extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundLogin() {
        super(("Credentials not founded"));
    }
}
