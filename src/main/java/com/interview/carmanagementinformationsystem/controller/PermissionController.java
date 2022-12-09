package com.interview.carmanagementinformationsystem.controller;

import com.interview.carmanagementinformationsystem.dto.request.permissionrequest.AddPermissionRequest;
import com.interview.carmanagementinformationsystem.exception.CarParkException;
import com.interview.carmanagementinformationsystem.service.permissionService.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/permit/")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @PostMapping("admin/addpermission")
    public String addPermission(AddPermissionRequest addPermissionRequest) throws CarParkException{
        return permissionService.addPermission(addPermissionRequest);
    }
}
