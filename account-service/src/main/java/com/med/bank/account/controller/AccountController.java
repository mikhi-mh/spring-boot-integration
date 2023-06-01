package com.med.bank.account.controller;

import com.med.bank.account.dto.BankDTO;
import com.med.bank.account.entity.Account;
import com.med.bank.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {

    @GetMapping("msg")
    public String getMsg(){
        return "Hi, hello,  this is from controller";
    }
    //    localhost:8282/account/msg


    @Autowired
    AccountService accountService;
    @PostMapping("create-account")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
//        return new ResponseEntity<>(accountService.createAccount(account), HttpStatus.CREATED);
        return ResponseEntity.ok(accountService.createAccount(account));
    }
    ///    localhost:8282/account/create-account/

    @GetMapping("getById")
    public ResponseEntity<Account> getAccountById(@PathVariable  Long id) {
        return ResponseEntity.ok(accountService.getAccountById(id));
        //return new ResponseEntity<>(accountService.getAccountById(id), HttpStatus.CREATED);
    }
    ///    localhost:8282/account/getById/1

    @GetMapping("getBankDetails/{id}")
    public ResponseEntity<BankDTO> getBankDetaiils(@PathVariable Integer id){
        return ResponseEntity.ok(accountService.getBankDetails(id));
    }
    ///    localhost:8282/account/getBankDetails/1002
}
