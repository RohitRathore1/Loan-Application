package com.example.customdashboardbackend.service;

import com.example.customdashboardbackend.entity.Dashboard;
import com.example.customdashboardbackend.entity.Widget;
import com.example.customdashboardbackend.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DashboardService {

    @Autowired
    private DashboardRepository dashboardRepository;

    public Object getAll(){
        return dashboardRepository.findAll();
    }

    public Object saveDashboard(Dashboard dashboard){
        return dashboardRepository.save(dashboard);
    }

    public Object deleteDashboard(int id){


        dashboardRepository.deleteById(id);
        return "success";
    }

    public Object updateDashboard(int id, Dashboard dashboard)
    {

        return dashboardRepository.findById(id)
                .map(oldDashboard -> {
                    Dashboard updated = oldDashboard.updateWith(dashboard);
                    return dashboardRepository.save(updated);
                });
    }

}
