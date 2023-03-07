package com.between.testjavabetween.commerce.price.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder(setterPrefix = "with")
public class Price {

    private PriceId id;
    private Brand brand;
    private Product product;
    private BigDecimal value;
    private String curr;
    private int priority;
    private Date startDate;
    private Date endDate;

    //TODO: respective business validations can be carried out in the entity

}
