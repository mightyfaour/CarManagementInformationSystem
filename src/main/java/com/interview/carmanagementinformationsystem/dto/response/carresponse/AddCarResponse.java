package com.interview.carmanagementinformationsystem.dto.response.carresponse;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
public class AddCarResponse {
    private boolean successful;
    private String id;
}
