package com.interview.carmanagementinformationsystem.data.model;


import com.interview.carmanagementinformationsystem.data.model.enums.Slot_Type;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parking_Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parking_Slot_Id;
    @Enumerated
    private Slot_Type slot_type;
    private String parking_Slot_Description;
    private String parking_Slot_Car_Id;
}
