package com.gentech.bank.service;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;
import java.util.List;
public interface SavingAccountService {

    SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto);
    SavingAccountDto getSavingAccount(Long id);
    SavingAccountDto creditAmount(Long id,Double amount);
    SavingAccountDto debitAmount(Long id,Double amount);
    List<SavingAccountDto> getAllSavingAccounts();
    void deleteSavingAccount(Long id);

}
