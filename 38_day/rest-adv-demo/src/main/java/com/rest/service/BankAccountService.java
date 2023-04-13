package com.rest.service;

import java.util.Collection;

import com.rest.domain.BankAccount;
import com.rest.dto.BankAccountDto;

public interface BankAccountService {
    Integer createNewAccount(BankAccountDto account);

    Collection<BankAccountDto> listAllAccounts();
}
