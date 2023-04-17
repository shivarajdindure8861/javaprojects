package com.shivu.project.Service;

import com.shivu.project.dto.InvoiceDto;

public interface InvoiceService {
    Integer createNewInvoice(InvoiceDto invoice);
}
