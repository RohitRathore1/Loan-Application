package com.example.customdashboardbackend.entity;

import lombok.*;
import javax.persistence.*;

@Embeddable
public class Occupation{

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_address")
    private Address companyAddress;

    @Column(name = "designation")
    private String designation;
}