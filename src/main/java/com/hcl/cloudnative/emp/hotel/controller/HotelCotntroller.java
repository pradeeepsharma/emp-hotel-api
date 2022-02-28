package com.hcl.cloudnative.emp.hotel.controller;

import com.hcl.cloudnative.emp.hotel.model.HotelResponse;
import com.hcl.cloudnative.emp.hotel.service.HotelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/emp")
public class HotelCotntroller {
    private HotelService hotelService;

    @GetMapping(value = "/hotels", produces = "application/json")
    public ResponseEntity<HotelResponse> getHotels(){
        return null;
    }
}
