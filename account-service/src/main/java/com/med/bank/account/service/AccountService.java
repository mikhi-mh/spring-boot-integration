package com.med.bank.account.service;

import com.med.bank.account.dto.BankDTO;
import com.med.bank.account.entity.Account;
import com.med.bank.account.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;


    @Autowired
    RestTemplate restTemplate;

    public Account createAccount(Account account){
        return accountRepo.save(account);
    }

    public Account getAccountById(Long id) {
         Optional<Account> accountOptional = accountRepo.findById(id);

         if(accountOptional.isPresent()){
             return accountOptional.get();
         }
         else{
             throw new ArithmeticException();
         }
    }

//    ResponseEntity<BankDTO> getBankDetails(Integer id){
//
//        BankDTO bankDTO = new BankDTO();
//        ResponseEntity<BankDTO> bankDTOResponseEntity =
//                restTemplate.getForEntity("" , "");
//
//    }

    public BankDTO getBankDetails(Integer id){

        BankDTO bankDTO;
        ResponseEntity<BankDTO> bankDTOResponseEntity = new RestTemplate()
                .exchange("http://localhost:9292/bank/getById/{id}" + id , HttpMethod.GET, BankDTO.class);


        bankDTO = bankDTOResponseEntity.getBody();

        return bankDTO;
    }

}
