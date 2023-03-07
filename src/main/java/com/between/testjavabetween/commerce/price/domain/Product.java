package com.between.testjavabetween.commerce.price.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class Product {

    private ProductId id;
    private String name;

    //TODO: respective business validations can be carried out in the entity
}
