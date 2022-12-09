package com.interview.carmanagementinformationsystem.service.car_roleservice;

import com.interview.carmanagementinformationsystem.dto.request.carrolerequest.AddCar_RoleRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

public interface Car_RoleService {

    String addCar_Role(AddCar_RoleRequest addCar_roleRequest) throws CarParkException;
}
