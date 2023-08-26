package com.marronjo.crypto.common.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ErrorHandler {
    @ExceptionHandler(value = ApiError.class)
    public ResponseEntity<String> handleException(ApiError a){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(a.getMessage());
    }
}
