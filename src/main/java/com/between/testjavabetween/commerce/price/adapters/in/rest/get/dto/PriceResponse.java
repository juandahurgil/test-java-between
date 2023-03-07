package com.between.testjavabetween.commerce.price.adapters.in.rest.get.dto;

import com.between.testjavabetween.commerce.price.domain.Price;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Builder(setterPrefix = "with")
public class PriceResponse {

    private Long priceId;
    private Long brandId;
    private Long productId;
    private BigDecimal value;
    private Date startDate;
    private Date endDate;

    public static PriceResponse from(Price price) {
        return PriceResponse.builder()
            .withPriceId(price.getId().id())
            .withBrandId(price.getBrand().getId().id())
            .withProductId(price.getProduct().getId().id())
            .withValue(price.getValue())
            .withStartDate(price.getStartDate())
            .withEndDate(price.getEndDate())
            .build();
    }
}

