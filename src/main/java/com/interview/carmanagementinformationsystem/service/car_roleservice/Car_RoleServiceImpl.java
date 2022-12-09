package com.interview.carmanagementinformationsystem.service.car_roleservice;

import com.interview.carmanagementinformationsystem.dto.request.carrolerequest.AddCar_RoleRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Car_RoleServiceImpl implements Car_RoleService {

    @Override
    public String addCar_Role(AddCar_RoleRequest addCar_roleRequest) throws CarParkException {
        return null;
    }
}
