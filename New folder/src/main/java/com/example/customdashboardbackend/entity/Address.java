package com.example.customdashboardbackend.entity;

import lombok.*;
import javax.persistence.*;

@Embeddable
@Getter
@Setter
@toString
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Column(name = "area")
    private String area;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zip")
    private String zip;

    @Column(name = "country")
    private String country;
}