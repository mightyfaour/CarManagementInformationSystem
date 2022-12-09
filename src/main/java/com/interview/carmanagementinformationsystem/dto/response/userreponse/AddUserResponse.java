package com.interview.carmanagementinformationsystem.dto.response.userreponse;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class AddUserResponse {
    private boolean successful;
    private String id;
}
