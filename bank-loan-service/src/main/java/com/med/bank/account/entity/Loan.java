package com.med.bank.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Loan {

    @Id
    @GeneratedValue
    private Long loanId;

    @NotNull
    private String loanType;

    @NotNull
    private Double loanAmount;

    @NotNull
    private Integer loanDuration;

    @NotNull
    private Double rateOfInterest;

    @NotNull
    private Long remainingLoanAmount;

    @NotNull
    private Double emiAmount;
}
