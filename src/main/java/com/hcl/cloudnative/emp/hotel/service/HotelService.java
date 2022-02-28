package com.hcl.cloudnative.emp.hotel.service;

import com.hcl.cloudnative.emp.hotel.domain.Hotel;
import com.hcl.cloudnative.emp.hotel.exception.HotelNotFoundException;
import com.hcl.cloudnative.emp.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelService {

    @Autowired
    HotelRepository repository;

    public List<Hotel> getHotels(){
        List<Hotel> hotels = new ArrayList<>();
        repository.findAll().forEach(hotels::add);
        if(hotels.size()<1)
            throw new HotelNotFoundException("NO RECORD FOUND FOR HOTEL(S)");
        return hotels;
    }

    public Hotel getHotel(Integer id){
      return repository.findById(id).orElseThrow(()->new HotelNotFoundException("No Hotel found for given id :"+id));
    }

}
