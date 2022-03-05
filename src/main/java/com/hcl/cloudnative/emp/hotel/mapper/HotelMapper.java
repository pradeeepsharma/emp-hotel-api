package com.hcl.cloudnative.emp.hotel.mapper;

import com.hcl.cloudnative.emp.hotel.domain.Hotel;
import com.hcl.cloudnative.emp.hotel.model.HotelResponse;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface HotelMapper {
    HotelResponse mapToResponse(Hotel hotel);
}
