package com.interview.carmanagementinformationsystem.dto.request.permissionrequest;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AddPermissionRequest {
    private String car_Number;
    private String car_Type;
    private String cat_Category;
    private String car_Description;
    private String car_Owner_Id;
}
