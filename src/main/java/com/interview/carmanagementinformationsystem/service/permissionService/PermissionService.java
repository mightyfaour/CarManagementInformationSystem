package com.interview.carmanagementinformationsystem.service.permissionService;

import com.interview.carmanagementinformationsystem.dto.request.permissionrequest.AddPermissionRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;

public interface PermissionService {
    String addPermission(AddPermissionRequest addPermissioRequest) throws CarParkException;
}
