package com.interview.carmanagementinformationsystem.controller;

import com.interview.carmanagementinformationsystem.data.model.CarNumber;
import com.interview.carmanagementinformationsystem.dto.request.carrequest.AddCarRequest;
import com.interview.carmanagementinformationsystem.dto.request.carrequest.UpdateCarRequest;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.AddCarResponse;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.UpdateCarResponse;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import com.interview.carmanagementinformationsystem.service.carservice.CarService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1/car/")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("admin/addcar/")
    public ResponseEntity<?> addCar (@RequestBody AddCarRequest addCarRequest) throws CarParkException{
        AddCarResponse addCarResponse = carService.addCar(addCarRequest);
        return new ResponseEntity<>(addCarResponse, HttpStatus.CREATED) ;
    }

    @PatchMapping("updatcardetails/{carnumber}")
    public ResponseEntity<?> deleteCarByCarNumber (@PathVariable String carnumber, @RequestBody UpdateCarRequest updateCarRequest ) throws  CarParkException{
        UpdateCarResponse updateCarResponse = carService.updateCarDetails(carnumber, updateCarRequest);
        return new ResponseEntity<>(updateCarResponse, HttpStatus.OK);
    }

    @DeleteMapping("deletecar")
    public ResponseEntity<?> deleteCarByCarNumber(@PathVariable String carnumber) throws CarParkException{
        return new ResponseEntity<>(carService.deleteCarByCarNumber(carnumber), HttpStatus.OK);
    }

}
