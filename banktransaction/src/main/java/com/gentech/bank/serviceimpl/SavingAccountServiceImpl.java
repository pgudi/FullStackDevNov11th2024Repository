package com.gentech.bank.serviceimpl;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;
import com.gentech.bank.exception.ResourceNotFoundException;
import com.gentech.bank.mapper.SavingAccountMapper;
import com.gentech.bank.repository.SavingAccountRepository;
import com.gentech.bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {
    @Autowired
    private SavingAccountRepository repository;

    @Override
    public SavingAccountDto createSavingAccount(SavingAccountDto savingAccountDto) {
        SavingAccount savingAccount= SavingAccountMapper.mapToSavingAccount(savingAccountDto);
        SavingAccount savedAccount=repository.save(savingAccount);
        return SavingAccountMapper.mapToSavingAccountDto(savedAccount);
    }

    @Override
    public SavingAccountDto getSavingAccount(Long id) {
        SavingAccount savingAccount=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id "+id+" does not exists, Please provide valid Account id!!!"));
        return SavingAccountMapper.mapToSavingAccountDto(savingAccount);
    }
}
