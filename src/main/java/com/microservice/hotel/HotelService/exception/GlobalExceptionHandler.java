package com.microservice.hotel.HotelService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import lombok.Builder;


@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(HotelNotFoundException.class)
    public ResponseEntity<ApiResponse> handleHotelNotFoundException(HotelNotFoundException hotelNotFoundException) {
        String msg = hotelNotFoundException.getMessage();
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(msg);
        apiResponse.setStatus(String.valueOf(HttpStatus.NOT_FOUND));

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }
}
