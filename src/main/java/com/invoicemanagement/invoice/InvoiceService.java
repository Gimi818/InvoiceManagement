package com.invoicemanagement.invoice;

import com.invoicemanagement.invoice.dto.InvoiceRequestDto;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class InvoiceService {
    private final InvoiceRepository repository;
    private final InvoiceMapper invoiceMapper;


    public Invoice saveInvoice(InvoiceRequestDto invoiceRequestDto) {
        log.info("Saving invoice {}", invoiceRequestDto);
        Invoice invoice = repository.save(invoiceMapper.dtoToEntity(invoiceRequestDto));
        log.info("Saved invoice {}", invoice);
        return invoice;
    }

}
