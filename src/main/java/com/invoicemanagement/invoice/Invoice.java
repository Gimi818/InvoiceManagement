package com.invoicemanagement.invoice;

import com.invoicemanagement.buyer.Buyer;
import com.invoicemanagement.seller.Seller;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "invoice")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String invoiceNumber;
    @ManyToOne
    private Seller seller;
    @OneToOne
    private Buyer buyer;
    private LocalDate issueDate;
    private LocalDate saleDate;
    private double basicAmount;
    private int tax;
    private BigDecimal totalAmount;
}
