package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundByAccountNumber extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundByAccountNumber(Object objc) {
        super(("Not found bank details by AccountNumber: " + objc));
    }
}
