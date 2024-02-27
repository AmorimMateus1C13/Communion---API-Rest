package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFindListAddressException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFindListAddressException() {
        super(("Not found a list of address. Maybe it is empty."));
    }
}
