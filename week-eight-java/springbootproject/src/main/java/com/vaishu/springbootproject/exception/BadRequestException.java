package com.vaishu.springbootproject.exception;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){

        super(message);
    }
}
