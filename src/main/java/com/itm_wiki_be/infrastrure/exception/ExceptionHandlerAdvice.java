package com.itm_wiki_be.infrastrure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(com.winwintek.huyndaingv.config.exception.RestApiException.class)
    public ResponseEntity<?> handlerException(com.winwintek.huyndaingv.config.exception.RestApiException ex) {
        ApiError apiError = new ApiError(ex.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }
}
