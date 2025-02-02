package com.gentech.bank.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccountDto {
    private Long id;
    private String accountHolderName;
    private Double balance;
    private Date createdDate;
    private Date modifiedDate;
}
