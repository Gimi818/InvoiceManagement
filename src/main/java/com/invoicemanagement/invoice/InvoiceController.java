package com.invoicemanagement.invoice;

import com.invoicemanagement.invoice.dto.InvoiceRequestDto;
import com.invoicemanagement.invoice.dto.InvoiceResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/invoices")
public class InvoiceController {

    private final InvoiceService service;

    @PostMapping("/add")
    public ResponseEntity<Invoice> saveInvoice(@RequestBody InvoiceRequestDto invoiceRequestDto) {
        return new ResponseEntity<>(service.saveInvoice(invoiceRequestDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvoiceResponseDto> findInvoiceById(@PathVariable Long id) {
        InvoiceResponseDto invoiceResponseDto = service.findInvoiceById(id);
        return ResponseEntity.status(HttpStatus.OK).body(invoiceResponseDto);
    }
}
