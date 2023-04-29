package com.shivu.project.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDto {
    private Long id;
    private String client;
    private LocalDate invDt;
    private Double amt;
}
