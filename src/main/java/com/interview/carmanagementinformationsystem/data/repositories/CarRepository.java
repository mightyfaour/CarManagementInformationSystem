package com.interview.carmanagementinformationsystem.data.repositories;

import com.interview.carmanagementinformationsystem.data.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findCarByCarNumber(String carNumber);
}
