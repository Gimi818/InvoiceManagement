package com.invoicemanagement.invoice;

import com.invoicemanagement.invoice.dto.InvoiceRequestDto;
import com.invoicemanagement.invoice.dto.InvoiceResponseDto;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public InvoiceResponseDto findInvoiceById(Long id) {
        log.info("Finding invoice with ID {}", id);
        Invoice invoice = repository.findById(id).orElseThrow();
        log.info("Found invoice {}", invoice);
        return invoiceMapper.entityToDto(invoice);
    }

    public List<InvoiceResponseDto> findAllInvoice() {
        log.info("Finding all invoice...");
        return repository.findAll().stream()
                .map(invoiceMapper::entityToDto)
                .collect(Collectors.toList());
    }

}
