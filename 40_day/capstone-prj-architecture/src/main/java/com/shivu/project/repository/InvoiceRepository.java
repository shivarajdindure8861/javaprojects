package com.shivu.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.shivu.project.domain.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

}
