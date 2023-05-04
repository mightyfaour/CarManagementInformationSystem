package com.interview.carmanagementinformationsystem.data.model;


import com.interview.carmanagementinformationsystem.data.model.enums.CarNumberType;
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
    private CarNumberType carnumbertype;
    private String carNumberDescription;
    private String carNumberCustomerId;

}
