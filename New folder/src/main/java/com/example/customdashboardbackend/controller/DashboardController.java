package com.example.customdashboardbackend.controller;

import com.example.customdashboardbackend.entity.Dashboard;
import com.example.customdashboardbackend.entity.Widget;
import com.example.customdashboardbackend.service.DashboardService;
import com.example.customdashboardbackend.service.ShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/get-all")
    private Object getDashboard(){
        return dashboardService.getAll();
    }

    @PostMapping("/create")
    private Object createDashboard(@RequestBody Dashboard dashboard) {
        return dashboardService.saveDashboard(dashboard);
    }

    @DeleteMapping("/delete/{id}")
    private Object deleteWidget(@PathVariable("id") int id){
        return dashboardService.deleteDashboard(id);
    }

    @PutMapping("/update/{id}")
    private Object updateDashboard(@PathVariable("id") int id, @RequestBody Dashboard dashboard){
        return dashboardService.updateDashboard(id,dashboard);
    }
}
