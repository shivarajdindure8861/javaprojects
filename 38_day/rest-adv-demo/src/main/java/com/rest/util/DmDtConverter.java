package com.rest.util;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.rest.domain.BankAccount;
import com.rest.dto.BankAccountDto;

@Component
public class DmDtConverter {
    public BankAccount toDomain(BankAccountDto dto) {
        return new BankAccount(dto.getId(), dto.getOwner(), dto.getBalance(), LocalDate.now());
    }

    public BankAccountDto toDto(BankAccount domain) {
        return new BankAccountDto(domain.getId(), domain.getOwner(), domain.getBalance());
    }
}
