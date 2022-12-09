package com.interview.carmanagementinformationsystem.data.model.user;

import com.interview.carmanagementinformationsystem.data.model.enums.RoleType;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated
    private RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }
}
