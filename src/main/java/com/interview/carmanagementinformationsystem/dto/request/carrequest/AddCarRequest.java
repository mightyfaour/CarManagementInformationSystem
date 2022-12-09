package com.interview.carmanagementinformationsystem.dto.request.carrequest;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AddCarRequest {
    private String carNumber;
    private String type;
    private String Category;
    private String Description;
    private String OwnerId;
}
