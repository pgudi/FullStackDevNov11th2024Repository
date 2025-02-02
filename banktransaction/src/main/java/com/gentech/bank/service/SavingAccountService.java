package com.gentech.bank.service;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;

public interface SavingAccountService {

    SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto);
    SavingAccountDto getSavingAccount(Long id);
}
