package com.shivu.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivu.project.domain.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
