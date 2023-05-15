package com.vaishu.springbootproject.exception;

import com.vaishu.springbootproject.dto.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ProductNotFoundException.class})
    public ResponseEntity<?> notFoundExceptionHandler(Exception ex) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTimestamp(new Date());
        errorDetails.setMessage(ex.getMessage());
        errorDetails.setStatus("Request Failed");
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({BadRequestException.class})
    public ResponseEntity<?> badRequestExceptionHandler(Exception ex) {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setTimestamp(new Date());
        errorDetails.setMessage(ex.getMessage());
        errorDetails.setStatus("Request Failed");
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }
}
