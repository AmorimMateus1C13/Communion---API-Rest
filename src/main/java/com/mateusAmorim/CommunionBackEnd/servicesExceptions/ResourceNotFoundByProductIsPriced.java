package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class ResourceNotFoundByProductIsPriced extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundByProductIsPriced(Object objc) {
        super(("Not found product by the choice: " + objc));
    }

}
