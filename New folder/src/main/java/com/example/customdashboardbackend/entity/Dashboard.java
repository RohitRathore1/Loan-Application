package com.example.customdashboardbackend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Dashboard")
public class Dashboard {

    @Id
    @GeneratedValue
    private int id;
    private String user;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="dashboard_id",referencedColumnName = "id")
    private List<Widget> widgets;

    public Dashboard(int id, String user, String name) {
        this.id = id;
        this.user = user;
        this.name = name;
    }


    //    public Dashboard(int id) {
//        this.id = id;
//    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public Dashboard updateWith(Dashboard dashboard) {
        return new Dashboard(
                this.id,
                dashboard.user,
                dashboard.name
        );
    }
}
