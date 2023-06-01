package com.med.bank.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
public class BankDTO {
    private Integer id;
    private String bankName;
    private String branchName;
}
