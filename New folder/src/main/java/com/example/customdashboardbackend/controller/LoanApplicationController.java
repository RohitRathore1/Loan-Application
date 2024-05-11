package com.example.customdashboardbackend.controller;

import com.example.customdashboardbackend.entity.LoanApplication;
import com.example.customdashboardbackend.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loan-applications")
@CrossOrigin(origins = "*")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService loanApplicationService;

    @GetMapping("/all")
    public ResponseEntity<List<LoanApplication>> getAllLoanApplications() {
        return ResponseEntity.ok(loanApplicationService.getAllLoanApplications());
    }

    @PostMapping("/create")
    public ResponseEntity<LoanApplication> createLoanApplication(@RequestBody LoanApplication loanApplication) {
        return ResponseEntity.ok(loanApplicationService.createLoanApplication(loanApplication));
    }
}
