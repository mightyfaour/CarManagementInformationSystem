package com.interview.carmanagementinformationsystem.data.model;

import com.interview.carmanagementinformationsystem.data.model.enums.Parking_Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Parking Data")
public class Parking_Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String parking_Id;
    private BigDecimal parking_Fee;
    private String parking_Description;
    private Parking_Type parking_Type;
    private String parking_car_Id;
}
