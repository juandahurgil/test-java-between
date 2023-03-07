package com.between.testjavabetween.commerce.price.domain;

import java.util.Date;
import java.util.Optional;

public interface PricesGetterRepository {

    Optional<Price> getPrice(Long brandId, Long productId, Date applicationDate);
}

