package com.hcl.cloudnative.emp.hotel.service;

import com.hcl.cloudnative.emp.hotel.domain.Hotel;
import com.hcl.cloudnative.emp.hotel.exception.HotelNotFoundException;
import com.hcl.cloudnative.emp.hotel.mapper.HotelMapper;
import com.hcl.cloudnative.emp.hotel.model.HotelResponse;
import com.hcl.cloudnative.emp.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class HotelService {

    @Autowired
    HotelRepository repository;
    @Autowired
    HotelMapper mapper;

    public List<HotelResponse> getHotels(){
        List<HotelResponse> hotels = new ArrayList<>();

        hotels =  repository.findAll().stream().map(mapper::mapToResponse).collect(Collectors.toList());
        if(hotels.isEmpty())
            throw new HotelNotFoundException("NO RECORD FOUND FOR HOTEL(S)");
        return hotels;
    }

    public Hotel getHotel(Integer id){
      return repository.findById(id).orElseThrow(()->new HotelNotFoundException("No Hotel found for given id :"+id));
    }

}
