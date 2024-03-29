package com.interview.carmanagementinformationsystem.data.model;

import com.interview.carmanagementinformationsystem.data.model.enums.Parking_Type;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String parking_Id;
    private BigDecimal parking_Fee;
    private String parking_Description;
    @Enumerated
    private Parking_Type parking_Type;
    private String parking_car_Id;
}
