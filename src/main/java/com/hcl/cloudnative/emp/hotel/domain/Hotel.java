package com.hcl.cloudnative.emp.hotel.domain;

import lombok.Data;

@Data
public class Hotel {
    private int id;
    private String name;
    private int floors;
    private String address;
}
