package com.bertran.pruebatrabajo.mappers;

import com.bertran.pruebatrabajo.domain.Price;
import com.bertran.pruebatrabajo.domain.dtos.PriceDto;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    default Optional<PriceDto> toOptionalDto(Optional<Price> price){
        return price.map(this::toDto);
    }

    PriceDto toDto(Price price);
}
