package com.example.customdashboardbackend.service;

import com.example.customdashboardbackend.entity.LoanApplication;
import com.example.customdashboardbackend.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    @Autowired
    private LoanApplicationRepository loanApplicationRepository;

    public List<LoanApplication> getAllLoanApplications() {
        return loanApplicationRepository.findAll();
    }

    public LoanApplication createLoanApplication(LoanApplication loanApplication) {
        return loanApplicationRepository.save(loanApplication);
    }
}
