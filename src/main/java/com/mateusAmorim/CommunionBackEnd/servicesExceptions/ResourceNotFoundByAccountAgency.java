package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundByAccountAgency extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundByAccountAgency(Object objc) {
        super(("Not found bank detail by account agency: " + objc));
    }
}
