package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundApartException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundApartException(Object objc) {
        super(("Apart " + objc + "not found in database."));
    }
}
