package com.interview.carmanagementinformationsystem.service.carservice;

import com.interview.carmanagementinformationsystem.dto.request.carrequest.AddCarRequest;
import com.interview.carmanagementinformationsystem.dto.request.carrequest.UpdateCarRequest;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.AddCarResponse;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.DeleteCarResponse;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.UpdateCarResponse;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

public interface CarService {
    AddCarResponse addCar(AddCarRequest addCarRequest) throws CarParkException;

    UpdateCarResponse updateCarDetails(String carnumber, UpdateCarRequest updateCarRequest) throws CarParkException;


    DeleteCarResponse deleteCarByCarNumber(String carnumber) throws CarParkException;
}
