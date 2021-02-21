package com.bertran.pruebatrabajo;

import com.bertran.pruebatrabajo.domain.dtos.PriceDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Sql({"/schema.sql", "/inserts.sql"})
class PruebaTrabajoApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void firstTest() {

        String date = "2020-06-14T10:00:00";
        String productId = "35455";
        String brandId = "1";

        PriceDto price = PriceDto.builder()
                .brandId(1L)
                .startDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59))
                .priceList(1L)
                .productId(35455L)
                .price(35.50)
                .build();

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/" + date + "/" + productId + "/" + brandId, PriceDto.class);
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        assertEquals(price, responseEntity.getBody());
    }

    @Test
    void secondTest() {

        String date = "2020-06-14T16:00:00";
        String productId = "35455";
        String brandId = "1";

        PriceDto price = PriceDto.builder()
                .brandId(1L)
                .startDate(LocalDateTime.of(2020, 6, 14, 15, 0, 0))
                .endDate(LocalDateTime.of(2020, 6, 14, 18, 30, 0))
                .priceList(2L)
                .productId(35455L)
                .price(25.45)
                .build();

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/" + date + "/" + productId + "/" + brandId, PriceDto.class);
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        assertEquals(price, responseEntity.getBody());
    }

    @Test
    void thirdTest() {

        String date = "2020-06-14T21:00:00";
        String productId = "35455";
        String brandId = "1";

        PriceDto price = PriceDto.builder()
                .brandId(1L)
                .startDate(LocalDateTime.of(2020, 6, 14, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59))
                .priceList(1L)
                .productId(35455L)
                .price(35.50)
                .build();

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/" + date + "/" + productId + "/" + brandId, PriceDto.class);
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        assertEquals(price, responseEntity.getBody());
    }

    @Test
    void fourthTest() {

        String date = "2020-06-15T10:00:00";
        String productId = "35455";
        String brandId = "1";

        PriceDto price = PriceDto.builder()
                .brandId(1L)
                .startDate(LocalDateTime.of(2020, 6, 15, 0, 0, 0))
                .endDate(LocalDateTime.of(2020, 6, 15, 11, 0, 0))
                .priceList(3L)
                .productId(35455L)
                .price(30.50)
                .build();

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/" + date + "/" + productId + "/" + brandId, PriceDto.class);
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        assertEquals(price, responseEntity.getBody());
    }

    @Test
    void fifthTest() {

        String date = "2020-06-16T21:00:00";
        String productId = "35455";
        String brandId = "1";

        PriceDto price = PriceDto.builder()
                .brandId(1L)
                .startDate(LocalDateTime.of(2020, 6, 15, 16, 0, 0))
                .endDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59))
                .priceList(4L)
                .productId(35455L)
                .price(38.95)
                .build();

        ResponseEntity<PriceDto> responseEntity = restTemplate.getForEntity("http://localhost:" + port + "/" + date + "/" + productId + "/" + brandId, PriceDto.class);
        assertTrue(responseEntity.getStatusCode().is2xxSuccessful());
        assertEquals(price, responseEntity.getBody());
    }

}
