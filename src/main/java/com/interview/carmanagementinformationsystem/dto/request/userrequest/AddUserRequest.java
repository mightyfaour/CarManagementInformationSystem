package com.interview.carmanagementinformationsystem.dto.request.userrequest;

import com.interview.carmanagementinformationsystem.data.model.enums.Gender;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddUserRequest {
    private String firstName;
    private String lastName;
    private String phoneNo;
    private String address;
    private String email;
    private String password;
    private LocalDate dob;
    private Gender gender;
}
