package com.interview.carmanagementinformationsystem.data.model;


import com.interview.carmanagementinformationsystem.data.model.enums.Permission_Module;
import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long permission_Id;
    @NonNull
    private Long permission_Role_Id;
    @NonNull
    private String permission_Title;
    @Enumerated
    private Permission_Module permission_module;
    private String Permission_Description;

}
