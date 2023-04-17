package com.shivu.restdemos.service;

import java.util.Collection;

import com.shivu.restdemos.dto.BankAccountDto;

public interface BankAccountService {
    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();
}
