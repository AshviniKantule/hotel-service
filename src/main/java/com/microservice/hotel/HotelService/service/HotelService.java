package com.microservice.hotel.HotelService.service;

import com.microservice.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {
     Hotel createHotel(Hotel hotel);
     List<Hotel> getAllHotels();
     Hotel getHotelById(String id);

}
