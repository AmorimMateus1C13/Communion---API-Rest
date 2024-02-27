package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFindBankByBankCodeException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFindBankByBankCodeException(Object objc) {
        super(("Not found bank by bank code: " + objc));
    }
}
