package com.between.testjavabetween.commerce.price.domain;

import com.between.testjavabetween.commerce.shared.domain.BusinessException;

public class PriceNotFoundException extends BusinessException {

    public PriceNotFoundException() {
        super("Price not found");
    }
}
