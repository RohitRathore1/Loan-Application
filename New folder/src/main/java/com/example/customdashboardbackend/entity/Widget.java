package com.example.customdashboardbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Widget")
public class Widget {

    @Id
    @GeneratedValue
    private int id;
    private String query;
    private String x_axis;
    private String y_axis;
    private String type;
    private String title;
    private int dashboard_id;
}
