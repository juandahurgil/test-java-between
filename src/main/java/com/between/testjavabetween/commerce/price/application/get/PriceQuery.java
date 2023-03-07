package com.between.testjavabetween.commerce.price.application.get;

import com.between.testjavabetween.commerce.price.domain.BrandId;
import com.between.testjavabetween.commerce.price.domain.ProductId;
import lombok.Getter;

import java.util.Date;

@Getter
public class PriceQuery {

    private final BrandId brandId;
    private final Date applicationDate;
    private final ProductId productId;

    public PriceQuery(Long brandId, Long productId, Date applicationDate) {
        this.brandId = new BrandId(brandId);
        this.productId = new ProductId(productId);
        this.applicationDate = applicationDate;
    }
}
