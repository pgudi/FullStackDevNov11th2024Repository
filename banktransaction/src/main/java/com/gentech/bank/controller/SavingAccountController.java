package com.gentech.bank.controller;

import com.gentech.bank.dto.SavingAccountDto;
import com.gentech.bank.service.SavingAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
