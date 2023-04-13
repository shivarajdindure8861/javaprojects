package com.rest.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BankAccount {
    private Long id;
    private String owner;
    private Double balance;
    private LocalDate lastModified;
}
