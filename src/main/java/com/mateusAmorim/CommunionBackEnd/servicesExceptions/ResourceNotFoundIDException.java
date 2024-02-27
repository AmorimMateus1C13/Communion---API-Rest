package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundIDException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundIDException(Object id) {
        super(("Resource not found by id " + id));
    }
}
