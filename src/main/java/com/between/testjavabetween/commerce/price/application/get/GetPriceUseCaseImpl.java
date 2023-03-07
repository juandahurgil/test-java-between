package com.between.testjavabetween.commerce.price.application.get;

import com.between.testjavabetween.commerce.price.domain.Price;
import com.between.testjavabetween.commerce.price.domain.PriceNotFoundException;
import com.between.testjavabetween.commerce.price.domain.PricesGetterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class GetPriceUseCaseImpl implements GetPriceUseCase {

    private final PricesGetterRepository pricesGetterRepository;

    public Price execute(PriceQuery query) {
        log.info("Getting price by product : {} and application Date: {}", query.getProductId(), query.getApplicationDate());
        return this.pricesGetterRepository.getPrice(query.getBrandId().id(), query.getProductId().id(), query.getApplicationDate())
            .orElseThrow(PriceNotFoundException::new);
    }
}
