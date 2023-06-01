package com.med.bank.account.service;
import com.med.bank.account.Repository.LoanRepo;
import com.med.bank.account.entity.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    @Autowired
    LoanRepo loanRepo;

    public Loan createLoan(Loan loan){
        return loanRepo.save(loan);
    }
}
