package com.interview.carmanagementinformationsystem.service.carservice;

import com.interview.carmanagementinformationsystem.data.model.Car;
import com.interview.carmanagementinformationsystem.data.repositories.CarRepository;
import com.interview.carmanagementinformationsystem.dto.request.carrequest.AddCarRequest;
import com.interview.carmanagementinformationsystem.dto.request.carrequest.UpdateCarRequest;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.AddCarResponse;
import com.interview.carmanagementinformationsystem.dto.response.carresponse.UpdateCarResponse;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CarService{

    private CarRepository carRepository;
    @Override
    public AddCarResponse addCar(AddCarRequest addCarRequest) throws CarParkException {
        Optional<Car> optionalCar = carRepository.findCarByCarNumber(addCarRequest.getCarNumber());
        if (optionalCar.isPresent()){
            throw new CarParkException("User with Car Number " + addCarRequest.getCarNumber()+" already exist", 400);
        }
        Car car = buildCar(addCarRequest);
        Car savedCar = carRepository.save(car);
        return AddCarResponse.builder()
                .successful(true)
                .id(String.valueOf(savedCar.getCarId()))
                .build();
    }

    @Override
    public UpdateCarResponse updateCarDetails(String carnumber, UpdateCarRequest updateCarRequest) throws CarParkException {
        return null;
    }

    private Car buildCar(AddCarRequest addCarRequest) {
        return Car.builder()
                .carNumber(addCarRequest.getCarNumber())
                .Description(addCarRequest.getDescription())
                .Category(addCarRequest.getCategory())
                .OwnerId(addCarRequest.getOwnerId())
                .Type(addCarRequest.getType())
                .build();
    }


}
