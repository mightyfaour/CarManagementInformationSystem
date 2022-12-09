package com.interview.carmanagementinformationsystem.dto.request.permissionrequest;

import com.interview.carmanagementinformationsystem.data.model.enums.Permission_Module;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddPermissioRequest {
    private Long permission_Role_Id;
    private String permission_Title;
    private Permission_Module permission_module;
    private String Permission_Description;
}
