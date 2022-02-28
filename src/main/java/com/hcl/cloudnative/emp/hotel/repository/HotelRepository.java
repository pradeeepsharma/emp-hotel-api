package com.hcl.cloudnative.emp.hotel.repository;

import com.hcl.cloudnative.emp.hotel.domain.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelRepository extends CrudRepository<Hotel,Integer> {
}
