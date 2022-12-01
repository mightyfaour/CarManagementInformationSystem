package com.interview.carmanagementinformationsystem.dto;

import com.interview.carmanagementinformationsystem.data.model.enums.Gender;
import com.interview.carmanagementinformationsystem.data.model.enums.UserRole;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddUserRequest {
    private String user_firstName;
    private String user_lastName;
    private String user_phoneNo;
    private String user_address;
    private String user_email;
    private String user_Password;
    private String user_Role_Id;
    private UserRole userRole;
    private LocalDate user_dob;
    private Gender gender;
}
