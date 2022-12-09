package com.interview.carmanagementinformationsystem.dto.request.userrequest;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserRequest {
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String address;
    private String email;
    private String password;
}
