package com.shivu.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.shivu.data.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
