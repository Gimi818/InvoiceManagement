package com.invoicemanagement.invoice;

import java.math.BigDecimal;

public class TaxCalculate {
    private Invoice invoice;
    public void calculate(Invoice invoice) {
        double tax = invoice.getTax() * invoice.getBasicAmount();
        invoice.setTotalAmount(BigDecimal.valueOf(tax));
    }
}
