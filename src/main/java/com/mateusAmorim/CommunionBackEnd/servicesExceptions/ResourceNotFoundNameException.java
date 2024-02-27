package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundNameException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundNameException(Object name) {
        super(("Resource not found by id " + name));
    }
}
