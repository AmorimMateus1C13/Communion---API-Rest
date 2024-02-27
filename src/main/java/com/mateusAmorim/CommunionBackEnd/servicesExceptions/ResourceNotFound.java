package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFound extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFound(Object obj) {
        super(("The requested resource could not be found" + obj));
    }
}
