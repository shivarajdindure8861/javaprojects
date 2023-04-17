package com.shivu.project.util;

import org.springframework.stereotype.Component;

import com.shivu.project.domain.Invoice;
import com.shivu.project.dto.InvoiceDto;

@Component
public class InvoiceMapper {
    public Invoice toDomain(InvoiceDto dto) {
        return new Invoice(dto.getId(), dto.getClient(), dto.getInvDt(), dto.getAmt());
    }

    public InvoiceDto toDto(Invoice domain) {
        return new InvoiceDto(domain.getId(), domain.getClient(), domain.getInvDt(), domain.getAmt());
    }
}
