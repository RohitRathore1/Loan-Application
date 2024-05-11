package com.example.customdashboardbackend.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "LoanApplication")
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id", updatable = false, nullable = false)
    private Long loanId;

    @Column(name = "loan_type", nullable = false)
    private String loanType;

    @Column(name = "loan_amount", nullable = false)
    private String loanAmount;

    @Column(name = "loan_term", nullable = false)
    private String loanTerm;

    @Column(name = "loan_status")
    private String loanStatus;

    @Column(name = "martial_status", nullable = false)
    private String martialStatus;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "dependence_number", nullable = false)
    private Integer dependenceNumber;

    @Column(name = "education", nullable = false)
    private String Education;

    @Column(name = "occupation", nullable = false)
    @Embedded
    private Occupation occupation;

    @Column(name = "applicant_income", nullable = false)
    private String income;

    @Column(name = "coapplicant_name", nullable = false)
    private String coapplicantName;

    @Column(name = "coapplicant_occupation", nullable = false)
    private Occupation coapplicantOccupation;

    @Column(name = "coapplicant_income", nullable = false)
    private String coapplicantIncome;

    @Column(name = "credit_history", nullable = false)
    private String creditHistory;

    @Column(name = "property_area", nullable = false)
    private String propertyArea;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Column(name = "created_on")
    private LocalDate createdOn;

    @Column(name = "application_status")
    @Enumerated(EnumType.STRING)
    private AcceptanceStatus applicationStatus;

    @Column(name = "existing_loan")
    private String existingLoan;
}