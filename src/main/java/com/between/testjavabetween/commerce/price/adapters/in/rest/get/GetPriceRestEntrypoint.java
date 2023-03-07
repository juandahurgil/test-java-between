package com.between.testjavabetween.commerce.price.adapters.in.rest.get;

import com.between.testjavabetween.commerce.price.adapters.in.rest.get.dto.PriceResponse;
import com.between.testjavabetween.commerce.shared.adapters.in.shared.EntityResponseError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

public interface GetPriceRestEntrypoint {

    @Operation(summary = "Get the right price by product", description = "Returns a JSON")
    @ApiResponses(
        value = {
            @ApiResponse(responseCode = "500", description = "If fail server", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityResponseError.class))),
            @ApiResponse(responseCode = "400", description = "Bad request", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityResponseError.class))),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EntityResponseError.class))),
            @ApiResponse(responseCode = "200", description = "Success operation")
        })
    ResponseEntity<PriceResponse> getPrice(
        @Parameter(description = "Id of brand", example = "1", required = true)
        @PathVariable Long brandId,
        @Parameter(description = "appication date to product", example = "2020-06-16T21:00:00", required = true)
        @RequestParam Date applicationDate,
        @Parameter(description = "Id of product", example = "35455", required = true)
        @RequestParam Long productId);
}
