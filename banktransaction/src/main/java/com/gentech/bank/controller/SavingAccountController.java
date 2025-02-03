package com.gentech.bank.controller;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class SavingAccountController {

    @Autowired
    private SavingAccountService service;
    @PostMapping("/savingaccount")
    public ResponseEntity<SavingAccountDto> createSavingAccount(@RequestBody SavingAccountDto savingAccountDto)
    {
        return new ResponseEntity<>(service.createSavingAccount(savingAccountDto), HttpStatus.CREATED);
    }

    @GetMapping("/savingaccount/{id}")
    public ResponseEntity<SavingAccountDto> getSavingAccountById(@PathVariable Long id)
    {
        return new ResponseEntity<>(service.getSavingAccount(id), HttpStatus.OK);
    }

    @PostMapping("/savingaccount/{id}/credit")
    public ResponseEntity<SavingAccountDto> creditAmount(@PathVariable Long id,
                                                        @RequestBody Map<String, Double> request)
    {
        Double amount=request.get("amount");
        return new ResponseEntity<>(service.creditAmount(id,amount), HttpStatus.OK);
    }

    @PostMapping("/savingaccount/{id}/debit")
    public ResponseEntity<SavingAccountDto> debitAmount(@PathVariable Long id,
                                                         @RequestBody Map<String, Double> request)
    {
        Double amount=request.get("amount");
        return new ResponseEntity<>(service.debitAmount(id,amount), HttpStatus.OK);
    }

    @GetMapping("/savingaccounts")
    public ResponseEntity<List<SavingAccountDto>> getAllSavingAccounts()
    {
        return new ResponseEntity<>(service.getAllSavingAccounts(),HttpStatus.OK);
    }

    @DeleteMapping("/savingaccount/{id}")
    public ResponseEntity<String> deleteSavingAccount(@PathVariable Long id)
    {
        service.deleteSavingAccount(id);
        return new ResponseEntity<>(("The Saving Account with id "+id+" has deleted successfully"),HttpStatus.OK);
    }
}
