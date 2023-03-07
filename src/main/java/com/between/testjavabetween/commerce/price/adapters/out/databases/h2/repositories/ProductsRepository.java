package com.between.testjavabetween.commerce.price.adapters.out.databases.h2.repositories;

import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<ProductEntity, Long> {

}
