package com.gentech.bank.serviceimpl;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.entity.SavingAccount;
import com.gentech.bank.exception.ResourceNotFoundException;
import com.gentech.bank.mapper.SavingAccountMapper;
import com.gentech.bank.repository.SavingAccountRepository;
import com.gentech.bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public SavingAccountDto creditAmount(Long id, Double amount) {
        SavingAccount savingAccount=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id "+id+" does not exists, Please provide valid Account id!!!"));

        Double total=savingAccount.getBalance() + amount;
        savingAccount.setBalance(total);
        SavingAccount savedAccount=repository.save(savingAccount);

        return SavingAccountMapper.mapToSavingAccountDto(savedAccount);
    }

    @Override
    public SavingAccountDto debitAmount(Long id, Double amount) {
        SavingAccount savingAccount=repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id "+id+" does not exists, Please provide valid Account id!!!"));
        if(savingAccount.getBalance() < amount)
        {
            throw new RuntimeException("Insufficient Balance in Saving Account!!!!");
        }
        Double total=savingAccount.getBalance() - amount;
        savingAccount.setBalance(total);
        SavingAccount savedAccount=repository.save(savingAccount);

        return SavingAccountMapper.mapToSavingAccountDto(savedAccount);
    }

    @Override
    public List<SavingAccountDto> getAllSavingAccounts() {
        return repository.findAll().stream().map((savingAccount) -> SavingAccountMapper.mapToSavingAccountDto(savingAccount))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteSavingAccount(Long id) {
        repository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("The Saving Account id "+id+" does not exists, Please provide valid Account id!!!"));
        repository.deleteById(id);
    }
}
