package com.interview.carmanagementinformationsystem.service.permissionService;

import com.interview.carmanagementinformationsystem.dto.request.permissionrequest.AddPermissionRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PermissionServiceImpl implements PermissionService{
    @Override
    public String addPermission(AddPermissionRequest addPermissionRequest) throws CarParkException {
        return null;
    }
}
