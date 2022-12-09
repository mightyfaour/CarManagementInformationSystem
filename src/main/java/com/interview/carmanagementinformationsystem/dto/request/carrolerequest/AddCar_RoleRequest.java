package com.interview.carmanagementinformationsystem.dto.request.carrolerequest;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddCar_RoleRequest {
    private Long role_Id;
    private String role_Title;
    private String role_Description;
}
