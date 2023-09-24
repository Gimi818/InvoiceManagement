package com.invoicemanagement.invoice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository  extends JpaRepository<Invoice,Long> {
}
