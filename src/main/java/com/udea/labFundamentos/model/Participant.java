package com.udea.labFundamentos.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Participant {
    private String name;
    private int age;
    private int creditScore;
    private long annualSalary;
    private long existingDebt;
    private long loanAmount;
    private String employmentStatus;
    private String maritalStatus;
    private int dependents;
    private String residentialStatus;
    private String loanPurpose;
    private long monthlyExpenses;
    private int employmentDuration;
    private int creditUsage;
    private int usageDuration;
}

