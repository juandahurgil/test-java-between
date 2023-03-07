package com.between.testjavabetween.commerce.price.application.get;

import com.between.testjavabetween.commerce.price.domain.Price;

public interface GetPriceUseCase {
    Price execute(PriceQuery query);
}
