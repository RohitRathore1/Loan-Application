package com.example.customdashboardbackend.service;

import com.example.customdashboardbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Object getUsers(){
        return userRepository.findAll();
    }
}
