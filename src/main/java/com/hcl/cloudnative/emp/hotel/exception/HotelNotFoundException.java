package com.hcl.cloudnative.emp.hotel.exception;

public class HotelNotFoundException extends RuntimeException {
    private String message;
    public HotelNotFoundException(Throwable throwable){
        super(throwable.getMessage(),throwable);
        this.message = throwable.getMessage();
    }

    public HotelNotFoundException(String message){
        super(message);
        this.message = message;
    }
}
