package com.bertran.pruebatrabajo.repositories;

import com.bertran.pruebatrabajo.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    Optional<Price> getFirstByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(Long brandId, Long productId, LocalDateTime localDateTime, LocalDateTime localDateTime2);

}
