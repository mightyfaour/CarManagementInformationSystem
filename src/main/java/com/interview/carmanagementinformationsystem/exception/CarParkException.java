package com.interview.carmanagementinformationsystem.exception;

import lombok.Getter;

@Getter
public class CarParkException extends Exception {
    private final int statusCode;

    public CarParkException(String message, int statusCode){
        super(message);
        this.statusCode = statusCode;
    }

}
