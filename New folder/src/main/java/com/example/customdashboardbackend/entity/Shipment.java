package com.example.customdashboardbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue
    private int id;
    private String shipmentNo;
    private String pickupLoc;
    private String dropLoc;
    private LocalDate pickupDay;
    private LocalDate dropDay;
    private String mode;
    private String Email;

}
