package com.interview.carmanagementinformationsystem.service;

import com.interview.carmanagementinformationsystem.dto.request.AddCarRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

public interface CarService {
    String addCar(AddCarRequest addCarRequest) throws CarParkException;
}
