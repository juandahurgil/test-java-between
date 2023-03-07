package com.between.testjavabetween.commerce.price.adapters.in.shared;

import com.between.testjavabetween.commerce.price.domain.PriceNotFoundException;
import com.between.testjavabetween.commerce.shared.adapters.in.shared.EntityResponseError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import static org.springframework.http.HttpStatus.*;

@Slf4j
@ControllerAdvice
public class ControllerAdvisor {

    public static final String PARAMETERS_CANNOT_BE_CONVERTED = "Input parameters cannot be converted";
    public static final String PRICE_NOT_EXISTS = "Price not exists";
    public static final String SERVER_ERROR = "Internal server error";

    @ExceptionHandler({RuntimeException.class, Exception.class})
    public ResponseEntity<EntityResponseError> handleInternalErrorException(Throwable exception) {
        log.error(SERVER_ERROR, exception);
        return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new EntityResponseError("There was an unexpected error"));
    }

    @ExceptionHandler({PriceNotFoundException.class})
    public ResponseEntity<EntityResponseError> handlePriceNotExistException(Throwable exception) {
        log.error(PRICE_NOT_EXISTS, exception);
        return ResponseEntity.status(NOT_FOUND).body(new EntityResponseError(PRICE_NOT_EXISTS));
    }

    @ExceptionHandler({MethodArgumentTypeMismatchException.class})
    public ResponseEntity<Object> handleMethodArgumentTypeMismatchException(
        Exception exception) {
        log.error(PARAMETERS_CANNOT_BE_CONVERTED, exception);
        return ResponseEntity.status(BAD_REQUEST).body(new EntityResponseError(PARAMETERS_CANNOT_BE_CONVERTED));
    }
}
