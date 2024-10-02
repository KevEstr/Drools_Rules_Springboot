package com.udea.labFundamentos.model;

public class Rate {
    private String loanStatus;
    private double loanRate;

    public Rate() {
    }

    public Rate(String loanStatus, double loanRate) {
        this.loanStatus = loanStatus;
        this.loanRate = loanRate;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }
}

