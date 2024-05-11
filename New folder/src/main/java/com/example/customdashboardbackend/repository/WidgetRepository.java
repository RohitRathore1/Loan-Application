package com.example.customdashboardbackend.repository;

import com.example.customdashboardbackend.entity.Widget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetRepository extends JpaRepository<Widget,Integer> {
}
