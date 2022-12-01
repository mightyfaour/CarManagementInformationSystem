package com.interview.carmanagementinformationsystem.data.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Parking Data")
public class Car_Number {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long car_number_Id;
    private Car_Number_Type car_number_type;
    private String car_Number_Description;
    private String car_Number_Customer_Id;

}
