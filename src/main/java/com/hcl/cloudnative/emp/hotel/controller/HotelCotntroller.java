package com.hcl.cloudnative.emp.hotel.controller;

import com.hcl.cloudnative.emp.hotel.domain.Hotel;
import com.hcl.cloudnative.emp.hotel.model.HotelResponse;
import com.hcl.cloudnative.emp.hotel.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/emp")
public class HotelCotntroller {
    @Autowired
    private HotelService hotelService;

    @GetMapping(value = "/hotels", produces = "application/json")
    public ResponseEntity<List<HotelResponse>> getHotels() {

        return new ResponseEntity<>(hotelService.getHotels(), HttpStatus.OK);
    }

    /*@GetMapping(value = "/hotels/{id}")
    public ResponseEntity<HotelResponse> getHotelDetails(@PathVariable String id){

    }*/
}
