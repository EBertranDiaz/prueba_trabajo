package com.bertran.pruebatrabajo.controllers;

import com.bertran.pruebatrabajo.domain.dtos.PriceDto;
import com.bertran.pruebatrabajo.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController(value = "/price")
public class PriceController {

    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping(value = "/{date}/{productId}/{brandId}")
    public ResponseEntity<PriceDto> findPrice(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") LocalDateTime date,
                                           @PathVariable Long productId,
                                           @PathVariable Long brandId) {
        Optional<PriceDto> optionalPrice = priceService.getPriceByDate(date, productId, brandId);
        return ResponseEntity.of(optionalPrice);
    }

}
