package com.interview.carmanagementinformationsystem.dto.response.carresponse;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCarResponse {
    private Long carId;
    private String carNumber;
    private String Type;
    private String Category;
    private String Description;
    private String OwnerId;
}
