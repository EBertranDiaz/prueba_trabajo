package com.bertran.pruebatrabajo.services;

import com.bertran.pruebatrabajo.domain.Price;
import com.bertran.pruebatrabajo.domain.dtos.PriceDto;
import com.bertran.pruebatrabajo.mappers.PriceMapper;
import com.bertran.pruebatrabajo.repositories.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;
    private final PriceMapper priceMapper;

    @Autowired
    public PriceServiceImpl(PriceRepository priceRepository, PriceMapper priceMapper) {
        this.priceRepository = priceRepository;
        this.priceMapper = priceMapper;
    }

    @Override
    public Optional<PriceDto> getPriceByDate(LocalDateTime date, Long productId, Long brandId) {

        return priceMapper.toOptionalDto(priceRepository.getFirstByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(brandId, productId, date, date));


    }
}
