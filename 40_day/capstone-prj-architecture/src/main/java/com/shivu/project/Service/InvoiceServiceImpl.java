package com.shivu.project.Service;

import org.springframework.stereotype.Service;

import com.shivu.project.dto.InvoiceDto;
import com.shivu.project.repository.InvoiceRepository;
import com.shivu.project.util.InvoiceMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository repository;
    private final InvoiceMapper mapper;

    @Override
    public Integer createNewInvoice(InvoiceDto dto) {
        repository.save(mapper.toDomain(dto));
        return 1;
    }

}
