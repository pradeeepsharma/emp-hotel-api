package com.hcl.cloudnative.emp.hotel.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Hotel {
    @Id
    private int id;
    private String name;
    private int floors;
    private String address;

}
