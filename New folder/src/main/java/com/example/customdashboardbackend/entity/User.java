package com.example.customdashboardbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "user", referencedColumnName = "email")
    private List<Dashboard> dashboards;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "default_dashboard")
    private Dashboard default_dashboard;
}
