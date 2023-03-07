package com.between.testjavabetween.commerce.shared.adapters.in.shared;

import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@ResponseBody
public record EntityResponseError(String timestamp, String message) {

    public EntityResponseError(String message) {
        this(new Date().toInstant().toString(), message);
    }
}
