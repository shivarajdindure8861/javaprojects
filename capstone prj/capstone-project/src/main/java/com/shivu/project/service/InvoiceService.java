package com.shivu.project.service;

import java.util.List;

import com.shivu.project.dto.InvoiceDto;
import com.shivu.project.exceptions.InvoiceNotFoundException;

public interface InvoiceService {
    Integer createNewInvoice(InvoiceDto invoice);

    List<InvoiceDto> all();

    Integer deleteInvoice(Long id) throws InvoiceNotFoundException;

    InvoiceDto fetchInvoiceDetails(Long id) throws InvoiceNotFoundException;

    Integer updateInvoice(InvoiceDto invoice);

}
