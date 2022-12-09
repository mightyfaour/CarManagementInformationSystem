package com.interview.carmanagementinformationsystem.data.model;


import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CarNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long car_number_Id;
    @Enumerated
    private Car_Number_Type car_number_type;
    private String car_Number_Description;
    private String car_Number_Customer_Id;

}
