package com.example.customdashboardbackend.controller;

import com.example.customdashboardbackend.service.UserService;
import com.example.customdashboardbackend.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    private Object getWidgets(){
        return userService.getUsers();
    }
}
