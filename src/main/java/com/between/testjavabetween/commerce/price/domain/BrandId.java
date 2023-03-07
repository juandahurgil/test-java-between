package com.between.testjavabetween.commerce.price.domain;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Valid
public record BrandId(@NotEmpty @NotBlank Long id) {
}
