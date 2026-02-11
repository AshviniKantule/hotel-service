package com.microservice.hotel.HotelService.service;

import com.microservice.hotel.HotelService.entities.Hotel;
import com.microservice.hotel.HotelService.exception.HotelNotFoundException;
import com.microservice.hotel.HotelService.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    HotelRepository repository;
    @Override
    public Hotel createHotel(Hotel hotel) {
        return repository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return repository.findAll();
    }

    @Override
    public Hotel getHotelById(String id) {
        return repository.findById(id).orElseThrow(()->new HotelNotFoundException("Hotel not found"));
    }
}
