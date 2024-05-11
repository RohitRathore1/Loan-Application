package com.example.customdashboardbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Embeddable
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Occupation{

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_address")
    private Address companyAddress;

    @Column(name = "designation")
    private String designation;
}