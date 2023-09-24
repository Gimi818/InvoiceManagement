package com.invoicemanagement.invoice;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class InvoiceService {
    private final InvoiceRepository repository;


}
