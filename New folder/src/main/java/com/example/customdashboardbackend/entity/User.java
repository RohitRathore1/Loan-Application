package com.example.customdashboardbackend.entity;

import lombok.*;
import javax.persistence.*;

import com.example.customdashboardbackend.enums.Role;
import com.example.customdashboardbackend.entity.Address;
import com.example.customdashboardbackend.entity.LoanApplication;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @Embedded
    @Column(name = "address", nullable = false)
    private Address address;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;
    

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "loan_application_id")
    @OneToMany(mappedBy = "user")
    @JoinColumn(name = "loan_id")
    private List<LoanApplication> loanApplications;

}
