package com.interview.carmanagementinformationsystem.dto.request.parkingrequest;

import com.interview.carmanagementinformationsystem.data.model.enums.Parking_Type;
import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class AddParkingRequest {
    private BigDecimal parking_Fee;
    private String parking_Description;
    private Parking_Type parking_Type;
    private String parking_car_Id;
}
