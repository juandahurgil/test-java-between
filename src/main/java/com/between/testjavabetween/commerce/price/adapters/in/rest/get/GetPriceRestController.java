package com.between.testjavabetween.commerce.price.adapters.in.rest.get;

import com.between.testjavabetween.commerce.price.adapters.in.rest.get.dto.PriceResponse;
import com.between.testjavabetween.commerce.price.application.get.GetPriceUseCase;
import com.between.testjavabetween.commerce.price.application.get.PriceQuery;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("/api/v1/brands")
public class GetPriceRestController implements GetPriceRestEntrypoint {

    private final GetPriceUseCase getPriceUseCase;

    public GetPriceRestController(GetPriceUseCase getPriceUseCase) {
        this.getPriceUseCase = getPriceUseCase;
    }

    @GetMapping("/{brandId}/products")
    public ResponseEntity<PriceResponse> getPrice(@PathVariable Long brandId,
                                                  @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") Date applicationDate,
                                                  @RequestParam Long productId) {

        final var priceQuery = new PriceQuery(brandId, productId, applicationDate);
        return ResponseEntity.ok(PriceResponse.from(this.getPriceUseCase.execute(priceQuery)));
    }
}
