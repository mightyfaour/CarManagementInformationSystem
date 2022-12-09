package com.interview.carmanagementinformationsystem.controller;

import com.interview.carmanagementinformationsystem.dto.request.userrequest.AddUserRequest;
import com.interview.carmanagementinformationsystem.dto.request.userrequest.UpdateUserRequest;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.AddUserResponse;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.UpdateUserResponse;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import com.interview.carmanagementinformationsystem.service.userservice.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/Carpark/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("Admin/addAUser")
    public ResponseEntity<?> addUser(@RequestBody AddUserRequest addUserRequest) throws CarParkException {
        AddUserResponse addUserResponse = userService.addUser(addUserRequest);
        return new ResponseEntity<>(addUserResponse, HttpStatus.CREATED);
    }

    @GetMapping("users/")
    public ResponseEntity<?> ListUsers() throws CarParkException {
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    @GetMapping("user/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) throws CarParkException {
        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
    }
    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable String id) throws CarParkException {
        return new ResponseEntity<>(userService.deleteUserById(id), HttpStatus.OK);
    }

    @PatchMapping("updateUserDetails/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable String id, @NonNull @RequestBody UpdateUserRequest updateUserRequest) throws CarParkException {
        UpdateUserResponse updateUserResponse = userService.updateUserDetails(id, updateUserRequest);
        return new ResponseEntity<>(updateUserResponse, HttpStatus.OK);
    }
}
