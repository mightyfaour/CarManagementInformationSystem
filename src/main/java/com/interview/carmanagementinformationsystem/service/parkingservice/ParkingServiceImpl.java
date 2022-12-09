package com.interview.carmanagementinformationsystem.service.parkingservice;

import com.interview.carmanagementinformationsystem.dto.request.parkingrequest.AddParkingRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ParkingServiceImpl implements ParkingService{

    public String addParking(AddParkingRequest addParkingRequest) throws CarParkException {
        return null;
    }
}
