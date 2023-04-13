package com.rest.repository;

import java.util.Collection;

import com.rest.domain.BankAccount;

public interface BankAccountRepository {
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
}
