package com.bertran.pruebatrabajo.services;

import com.bertran.pruebatrabajo.domain.dtos.PriceDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public interface PriceService {

    Optional<PriceDto> getPriceByDate(LocalDateTime date, Long productId, Long brandId);

}
