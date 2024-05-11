package com.example.customdashboardbackend.repository;

import com.example.customdashboardbackend.entity.Dashboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DashboardRepository extends JpaRepository<Dashboard,Integer> {
}
