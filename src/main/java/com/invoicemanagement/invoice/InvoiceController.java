package com.invoicemanagement.invoice;

import com.invoicemanagement.invoice.dto.InvoiceRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService service;

    @PostMapping("/add")
    public ResponseEntity<Invoice> saveInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto) {
        return new ResponseEntity<>(service.saveInvoice(invoiceRequestDto), HttpStatus.CREATED);
    }

}
