package com.hcl.cloudnative.emp.hotel.model;

import com.hcl.cloudnative.emp.hotel.domain.Hotel;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class HotelResponse {
    private int id;
    private String name;
    private int floors;
    private String address;
    List<Elevator> elevators;
}
