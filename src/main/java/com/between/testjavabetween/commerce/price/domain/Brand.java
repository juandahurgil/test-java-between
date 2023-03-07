package com.between.testjavabetween.commerce.price.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "with")
public class Brand {

    private BrandId id;
    private String name;
    private String email;

    //TODO: respective business validations can be carried out in the entity
}
