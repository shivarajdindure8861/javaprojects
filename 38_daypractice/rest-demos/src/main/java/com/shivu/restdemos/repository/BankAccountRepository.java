package com.shivu.restdemos.repository;

import java.util.Collection;

import com.shivu.restdemos.domain.BankAccount;

public interface BankAccountRepository {
    BankAccount save(BankAccount account);

    Collection<BankAccount> findAll();
}
