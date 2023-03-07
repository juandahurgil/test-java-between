package com.between.testjavabetween.commerce.shared.domain;

import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.ProductEntity;

public class ProductMother {

    public static ProductEntity createProduct(Long id, String name) {
        ProductEntity product = new ProductEntity();
        product.setId(id);
        product.setName(name);
        return product;
    }
}
