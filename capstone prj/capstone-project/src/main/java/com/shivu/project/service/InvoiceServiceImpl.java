package com.shivu.project.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shivu.project.domain.Invoice;
import com.shivu.project.dto.InvoiceDto;
import com.shivu.project.exceptions.InvoiceNotFoundException;
import com.shivu.project.repository.InvoiceRepository;
import com.shivu.project.util.InvoiceMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository repository;

    private final InvoiceMapper mapper;

    @Override
    public Integer createNewInvoice(InvoiceDto dto) {
        repository.save(mapper.toDomain(dto));
        return 1;

    }

    @Override
    public List<InvoiceDto> all() {
        return repository.findAll().stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Integer deleteInvoice(Long id) {
        repository.deleteById(id);
        return 1;
    }

    @Override
    public InvoiceDto fetchInvoiceDetails(Long id) {
        Optional<Invoice> op = repository.findById(id);
        return mapper.toDto(op.orElseThrow(() -> new InvoiceNotFoundException("Invoice " + id + " Not Found")));
    }

    @Override
    public Integer updateInvoice(InvoiceDto invoice) {
        repository.save(mapper.toDomain(invoice));
        return 1;
    }

}
