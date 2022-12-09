package com.interview.carmanagementinformationsystem.dto.request.carrequest;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateCarRequest {
    private Long carId;
    private String carNumber;
    private String Type;
    private String Category;
    private String Description;
    private String OwnerId;
}
