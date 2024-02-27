package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundTowerException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundTowerException(Object objc) {
        super(("Tower " + objc + "not found in database."));
    }
}
