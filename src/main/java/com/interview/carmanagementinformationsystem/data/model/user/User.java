package com.interview.carmanagementinformationsystem.data.model.user;

import com.interview.carmanagementinformationsystem.data.model.enums.Gender;
import com.interview.carmanagementinformationsystem.data.model.enums.RoleType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    public User(@NonNull String firstName, @NonNull String lastName, String email, String password, RoleType roleType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        if(roles == null){
            roles = new HashSet<>();
            roles.add(new Role(roleType));
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String phoneNo;
    private String address;
    private String email;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<Role> roles;
    private LocalDate dob;
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

}
