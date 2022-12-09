package com.interview.carmanagementinformationsystem.controller.exceptionHandler;

import com.interview.carmanagementinformationsystem.exception.CarParkException;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CarManagementExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(CarParkException.class)
    public ResponseEntity<?> handleCarParkException(CarParkException carParkException){
        ApiError apiError = ApiError.builder()
                .message(carParkException.getMessage())
                .status(false)
                .statusCode(carParkException.getStatusCode())
                .build();
        return new ResponseEntity<>(apiError, HttpStatusCode.valueOf(apiError.getStatusCode()));
    }

}
