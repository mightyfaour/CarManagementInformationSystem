package com.interview.carmanagementinformationsystem.data.model;

import com.interview.carmanagementinformationsystem.data.model.enums.Parking_Fee_Type;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Parking_Fee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long parking_Fee_Id;
    @Enumerated
    private Parking_Fee_Type parking_Fee_Type;
    private String parking_Fee_Description;
    private BigDecimal amount;
}
