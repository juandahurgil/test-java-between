package com.between.testjavabetween.commerce.shared.domain;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }
}
