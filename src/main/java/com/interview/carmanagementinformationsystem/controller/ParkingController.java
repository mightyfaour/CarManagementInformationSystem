package com.interview.carmanagementinformationsystem.controller;

import com.interview.carmanagementinformationsystem.dto.request.parkingrequest.AddParkingRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import com.interview.carmanagementinformationsystem.service.parkingservice.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/parking/")
public class ParkingController {

    @Autowired
    private ParkingService parkingService;

    @PostMapping("admin/addparking/")
    public String addParking(AddParkingRequest addParkingRequest) throws CarParkException{
        return parkingService.addParking(addParkingRequest);
    }
}
