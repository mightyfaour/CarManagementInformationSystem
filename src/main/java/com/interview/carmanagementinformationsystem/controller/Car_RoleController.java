package com.interview.carmanagementinformationsystem.controller;

import com.interview.carmanagementinformationsystem.dto.request.carrolerequest.AddCar_RoleRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import com.interview.carmanagementinformationsystem.service.car_roleservice.Car_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/car_role/")
public class Car_RoleController {

    @Autowired
    private Car_RoleService car_RoleService;

    @PostMapping("admin/addcar_role")
    public String addCar_Role(AddCar_RoleRequest addCar_roleRequest) throws CarParkException{
        return car_RoleService.addCar_Role(addCar_roleRequest);
    }
}
