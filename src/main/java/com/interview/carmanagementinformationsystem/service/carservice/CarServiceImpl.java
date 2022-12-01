package com.interview.carmanagementinformationsystem.service;

import com.interview.carmanagementinformationsystem.dto.request.AddCarRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService{
    @Override
    public String addCar(AddCarRequest addCarRequest) throws CarParkException {
        return null;
    }
}
