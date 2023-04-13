package com.rest.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rest.domain.BankAccount;
import com.rest.dto.BankAccountDto;
import com.rest.repository.BankAccountRepository;
import com.rest.util.DmDtConverter;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository repository;
    private final DmDtConverter converter;

    @Override
    public Integer createNewAccount(BankAccountDto dto) {
        repository.save(converter.toDomain(dto));
        return 1;
    }

    @Override
    public Collection<BankAccountDto> listAllAccounts() {
        return repository.findAll()
                .stream()
                // .map(account -> converter.toDto(account))
                .map(converter::toDto)
                .collect(Collectors.toList());
    }

}
