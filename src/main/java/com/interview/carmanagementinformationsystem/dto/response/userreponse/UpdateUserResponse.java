package com.interview.carmanagementinformationsystem.dto.response.userreponse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateUserResponse {
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String address;
    private String email;
    private String password;
}

