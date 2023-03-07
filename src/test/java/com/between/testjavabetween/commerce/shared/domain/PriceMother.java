package com.between.testjavabetween.commerce.shared.domain;

import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.BrandEntity;
import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.PriceEntity;
import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.ProductEntity;

import java.math.BigDecimal;
import java.util.Date;

public class PriceMother {

    private static final String CURR = "EUR";

    public static PriceEntity createPrice(Long id,
                                          BrandEntity brand,
                                          ProductEntity product,
                                          int priority,
                                          BigDecimal value,
                                          Date startDate,
                                          Date endDate) {
        PriceEntity price = new PriceEntity();
        price.setId(id);
        price.setBrand(brand);
        price.setProduct(product);
        price.setPriority(priority);
        price.setValue(value);
        price.setCurr(CURR);
        price.setStartDate(startDate);
        price.setEndDate(endDate);
        return price;
    }
}
