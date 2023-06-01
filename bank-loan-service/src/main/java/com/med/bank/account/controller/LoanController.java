package com.med.bank.account.controller;


import com.med.bank.account.entity.Loan;
import com.med.bank.account.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("loan")
public class LoanController {

    @Autowired
    LoanService loanService;

    @GetMapping("msg")
    public String getMsg(){
        return "this is from Controller";
    }
    //    localhost:8383/loan/msg


    @PostMapping("create-loan")
    public ResponseEntity<Loan> createLoan(@RequestBody Loan loan){
        return ResponseEntity.ok(loanService.createLoan(loan));
    }
    //    localhost:8383/loan/create-loan/
}
