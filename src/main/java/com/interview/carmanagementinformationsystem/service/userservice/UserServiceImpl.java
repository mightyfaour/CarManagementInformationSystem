package com.interview.carmanagementinformationsystem.service.userservice;

import com.interview.carmanagementinformationsystem.data.model.user.User;
import com.interview.carmanagementinformationsystem.data.repositories.UserRepository;
import com.interview.carmanagementinformationsystem.dto.request.userrequest.AddUserRequest;
import com.interview.carmanagementinformationsystem.dto.request.userrequest.UpdateUserRequest;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.AddUserResponse;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.DeleteUserResponse;
import com.interview.carmanagementinformationsystem.dto.response.userreponse.UpdateUserResponse;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public AddUserResponse addUser(AddUserRequest addUserRequest) throws CarParkException {
        Optional<User> foundUser = userRepository.findUserByEmail(addUserRequest.getEmail());
        if(foundUser.isPresent()){
            throw new CarParkException("User with email " + addUserRequest.getEmail() + " already exist",400);
        }
        User user = buildUser(addUserRequest);
        User savedUser = userRepository.save(user);
        return AddUserResponse.builder()
                .successful(true)
                .id(String.valueOf(savedUser.getId()))
                .build();
    }

    private User buildUser(AddUserRequest addUserRequest) {
        return User.builder()
                .firstName(addUserRequest.getFirstName())
                .lastName(addUserRequest.getLastName())
                .phoneNo(addUserRequest.getPhoneNo())
                .email(addUserRequest.getEmail())
                .password(addUserRequest.getPassword())
                .address(addUserRequest.getAddress())
                .build();
    }

    //    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User findById(String id) throws CarParkException {
        Optional<User> foundUser =  userRepository.findById(Long.valueOf(id));
        if(foundUser.isEmpty()){
            throw new CarParkException("User with Id " + id + " does not exist", 404);
        }
        return foundUser.get();
    }

    @Override
    public DeleteUserResponse deleteUserById(String id) throws CarParkException {
        Optional<User> foundUser =  userRepository.findById(Long.valueOf(id));
        if(foundUser.isEmpty()){
            throw new CarParkException("User with Id " + id + " does not exist", 404);
        }
        userRepository.deleteById(Long.valueOf(id));
        return new DeleteUserResponse(true);
    }

    @Override
    public UpdateUserResponse updateUserDetails(String id, UpdateUserRequest updateUserRequest) throws CarParkException {
        Optional<User> foundUser =  userRepository.findById(Long.valueOf(id));
        if(foundUser.isEmpty()){
            throw new CarParkException("User with Id " + id + " does not exist", 404);
        }
        User user = foundUser.get();
        user.setFirstName(updateUserRequest.getFirstName());
        user.setLastName(updateUserRequest.getLastName());
        user.setEmail(updateUserRequest.getEmail());
        user.setPhoneNo(updateUserRequest.getPhoneNo());
        user.setPassword(updateUserRequest.getPassword());
        user.setAddress(updateUserRequest.getAddress());
        userRepository.save(user);
        UpdateUserResponse updateUserResponse = new UpdateUserResponse();
        BeanUtils.copyProperties(updateUserRequest, updateUserResponse );
        return updateUserResponse;
    }
}
