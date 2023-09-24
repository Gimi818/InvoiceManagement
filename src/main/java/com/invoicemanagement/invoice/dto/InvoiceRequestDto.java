package com.invoicemanagement.invoice.dto;

import com.invoicemanagement.buyer.Buyer;
import com.invoicemanagement.seller.Seller;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.math.BigDecimal;
import java.time.LocalDate;

public record InvoiceRequestDto(String invoiceNumber, Seller seller, Buyer buyer,LocalDate issueDate,
                                LocalDate saleDate, double basicAmount, int tax, BigDecimal totalAmount) {}

