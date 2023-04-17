package com.shivu.restdemos.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.shivu.restdemos.dto.BankAccountDto;
import com.shivu.restdemos.repository.BankAccountRepository;
import com.shivu.restdemos.util.DmDtConverter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
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
