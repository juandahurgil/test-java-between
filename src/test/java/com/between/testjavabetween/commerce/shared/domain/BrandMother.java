package com.between.testjavabetween.commerce.shared.domain;

import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.BrandEntity;

public final class BrandMother {

    public static BrandEntity createBrand(Long id, String name, String email) {
        BrandEntity brand = new BrandEntity();
        brand.setId(id);
        brand.setName(name);
        brand.setEmail(email);
        return brand;
    }
}
