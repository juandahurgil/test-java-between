package com.between.testjavabetween.commerce.price.adapters.out.databases.h2.repositories;

import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface PricesRepository extends JpaRepository<PriceEntity, Long> {

    @Query(
        value = """
            SELECT p
             FROM PriceEntity p
             WHERE p.brand.id = :brandId AND p.product.id = :productId AND
             :applicationDate > p.startDate AND :applicationDate < p.endDate
            """
    )
    List<PriceEntity> findByBrandAndProductAndApplicationDate(@Param("brandId") Long brandId,
                                                              @Param("productId") Long productId,
                                                              @Param("applicationDate") Date applicationDate);
}
