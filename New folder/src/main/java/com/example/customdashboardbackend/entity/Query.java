package com.example.customdashboardbackend.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Query")
public class Query {

    @Id
    @GeneratedValue
    private int id;
    private String query;

    public String getQuery() {
        return query;
    }
}
