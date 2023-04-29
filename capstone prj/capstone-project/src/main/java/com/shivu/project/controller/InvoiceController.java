package com.shivu.project.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shivu.project.dto.AppResponse;
import com.shivu.project.dto.InvoiceDto;
import com.shivu.project.service.InvoiceService;

@RequestMapping(value = "/invoice")
public class InvoiceController {
    private InvoiceService service;

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> createNewInvoice(@RequestBody InvoiceDto dto) {
        final Integer sts = service.createNewInvoice(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                .sts("success")
                .msg("INvoice created successfully")
                .bd(sts)
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }

    @GetMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<List<InvoiceDto>>> allInvoices() {
        List<InvoiceDto> invoices = service.all();
        AppResponse<List<InvoiceDto>> response = AppResponse.<List<InvoiceDto>>builder()
                .sts("success")
                .msg("Invoices")
                .bd(invoices)
                .build();
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<Integer>> deleteInoice(@PathVariable Long id) {
        final Integer sts = service.deleteInvoice(id);

        final AppResponse<Integer> response = AppResponse.<Integer>builder()
                .sts("success")
                .msg("Invoice deleted Successfully")
                .bd(sts)
                .build();
        return ResponseEntity.status(200).body(response);
    }

    @GetMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse<InvoiceDto>> getInvoiceById(@PathVariable Long id) {
        final InvoiceDto dto = service.fetchInvoiceDetails(id);

        final AppResponse<InvoiceDto> response = AppResponse.<InvoiceDto>builder()
                .sts("Success")
                .msg("Invoice Details")
                .bd(dto)
                .build();
        return ResponseEntity.ok().body(response);
    }

    public ResponseEntity<AppResponse<Integer>> updateNewInvoice(@RequestBody InvoiceDto dto) {
        final Integer sts = service.updateInvoice(dto);

        final AppResponse<Integer> response = AppResponse.<Integer>builder().sts("success")
                .msg("Invoice Updated Successfully").bd(sts).build();
        return ResponseEntity.ok().body(response);

    }
}
