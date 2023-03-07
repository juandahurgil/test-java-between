package com.between.testjavabetween.commerce.price.adapters.out.databases.h2;

import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.model.PriceEntity;
import com.between.testjavabetween.commerce.price.adapters.out.databases.h2.repositories.PricesRepository;
import com.between.testjavabetween.commerce.price.domain.Price;
import com.between.testjavabetween.commerce.price.domain.PricesGetterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.Date;
import java.util.Optional;


@Slf4j
@RequiredArgsConstructor
@Repository
public class PriceH2Repository implements PricesGetterRepository {

    private final PricesRepository pricesRepository;

    @Override
    public Optional<Price> getPrice(Long brandId, Long productId, Date applicationDate) {
        log.debug("Fetching price by: brandId = {}, productId = {} and applicationDate = {}",
            brandId, productId, applicationDate);

        return this.pricesRepository
            .findByBrandAndProductAndApplicationDate(brandId, productId, applicationDate)
            .stream()
            .max(Comparator.comparingDouble(PriceEntity::getPriority))
            .map(PriceEntity::toPrice);
    }
}
