package com.mateusAmorim.CommunionBackEnd.servicesExceptions;

public class DiferrenceBetweenFieldException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DiferrenceBetweenFieldException() {
        super(("The data sent does not belong to the same recipient"));
    }
}
