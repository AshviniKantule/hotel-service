package com.microservice.hotel.HotelService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ApiResponse> handleHotelNotFoundException(HotelNotFoundException hotelNotFoundException){
    String msg = hotelNotFoundException.getMessage();
    ApiResponse response = ApiResponse.builder().message(msg).status(String.valueOf(HttpStatus.NOT_FOUND)).build();
    return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
