package com.microservice.hotel.HotelService.controller;

import com.microservice.hotel.HotelService.entities.Hotel;
import com.microservice.hotel.HotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(("/hotels"))
public class HotelController {
    @Autowired
    HotelService hotelService;

    @PostMapping("/save-hotel")
    public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
       Hotel hotel1 =  hotelService.createHotel(hotel);
       return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    @GetMapping("/get-hotel/{hotelId}")
    public ResponseEntity<Hotel> saveHotel(@PathVariable String hotelId){
        Hotel hotel1 =  hotelService.getHotelById(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotel1);
    }

    @GetMapping("/get-hotel")
    public ResponseEntity<List<Hotel>> saveHotel(){
        List<Hotel> hotels =  hotelService.getAllHotels();
        return ResponseEntity.of(Optional.ofNullable(hotels));
    }
}
