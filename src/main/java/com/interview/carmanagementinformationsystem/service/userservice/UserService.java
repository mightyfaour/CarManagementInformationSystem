package com.interview.carmanagementinformationsystem.service;

import com.interview.carmanagementinformationsystem.data.model.User;
import com.interview.carmanagementinformationsystem.dto.request.AddUserRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

import java.util.List;

public interface UserService {
    String addUser(AddUserRequest addUserRequest)throws CarParkException;
}
