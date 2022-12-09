package com.interview.carmanagementinformationsystem.controller.exceptionHandler;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApiError {
    private String message;
    private boolean status;
    private int statusCode;

}
