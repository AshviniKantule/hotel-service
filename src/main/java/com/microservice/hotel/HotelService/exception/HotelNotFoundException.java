package com.microservice.hotel.HotelService.exception;

public class HotelNotFoundException extends RuntimeException{
    public HotelNotFoundException() {
        super();
    }
    public HotelNotFoundException(String msg) {
        super(msg);
    }
}
