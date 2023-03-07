package com.between.testjavabetween.commerce.price.adapters.in.rest;

import com.between.testjavabetween.commerce.price.adapters.in.rest.get.dto.PriceResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

import java.math.BigDecimal;
import java.net.URI;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DisplayName("Get Price use case")
class GetPriceRestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @ParameterizedTest
    @DisplayName("Give a valid query request When get price by application date, brand and product Then should return a valid price")
    @MethodSource("prices")
    void shouldReturnValidPrice(Long productId, String applicationDate, Long priceId, BigDecimal value) {
        // Arrange
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString("/api/v1/brands/1/products")
            .queryParam("applicationDate", applicationDate)
            .queryParam("productId", productId);
        URI uri = builder.build().toUri();
        // Act
        ResponseEntity<PriceResponse> response = restTemplate.getForEntity(uri, PriceResponse.class);

        //Assert
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
        Assertions.assertEquals(priceId, response.getBody().getPriceId());
        Assertions.assertEquals(value, response.getBody().getValue());
    }

    private static Stream<Arguments> prices() {
        return Stream.of(
            Arguments.of(35455L, "2020-06-14T10:00:00", 1L, new BigDecimal("35.50")),
            Arguments.of(35455L, "2020-06-14T16:00:00", 2L, new BigDecimal("25.45")),
            Arguments.of(35455L, "2020-06-14T21:00:00", 1L, new BigDecimal("35.50")),
            Arguments.of(35455L, "2020-06-15T10:00:00", 3L, new BigDecimal("30.50")),
            Arguments.of(35455L, "2020-06-16T21:00:00", 4L, new BigDecimal("38.95"))
        );
    }
}
