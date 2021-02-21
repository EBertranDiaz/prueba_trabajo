package com.bertran.pruebatrabajo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Prices {

    private Long brandId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    @Id
    private Long priceList;
    private Long productId;
    private Long priority;
    private Double price;
    private String curr;

}
