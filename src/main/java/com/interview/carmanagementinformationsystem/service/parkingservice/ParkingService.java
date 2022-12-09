package com.interview.carmanagementinformationsystem.service.parkingservice;

import com.interview.carmanagementinformationsystem.dto.request.parkingrequest.AddParkingRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

public interface ParkingService {
    String addParking(AddParkingRequest addParkingRequest) throws CarParkException;
}
