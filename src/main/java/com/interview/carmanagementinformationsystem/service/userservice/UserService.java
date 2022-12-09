package com.interview.carmanagementinformationsystem.service.userservice;

import com.interview.carmanagementinformationsystem.data.model.user.User;
import com.interview.carmanagementinformationsystem.dto.request.userrequest.AddUserRequest;
import com.interview.carmanagementinformationsystem.dto.request.userrequest.UpdateUserRequest;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.AddUserResponse;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.DeleteUserResponse;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.UpdateUserResponse;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

import java.util.List;

public interface UserService {
   AddUserResponse addUser(AddUserRequest addUserRequest)throws CarParkException;

    List<User> getAllUsers() throws CarParkException;

    User findById(String id) throws CarParkException;

    DeleteUserResponse deleteUserById(String id) throws CarParkException;

    UpdateUserResponse updateUserDetails(String id, UpdateUserRequest updateUserRequest) throws CarParkException;
}
