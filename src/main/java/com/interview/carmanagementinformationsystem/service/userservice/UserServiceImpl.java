package com.interview.carmanagementinformationsystem.service;

import com.interview.carmanagementinformationsystem.dto.request.AddUserRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public String addUser(AddUserRequest addUserRequest) throws CarParkException {
        return null;
    }
}
