package com.invoicemanagement.invoice;

import com.invoicemanagement.client.Client;
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
    private Client client;
    // @ManyToOne
    //private Supplier supplier;
    private LocalDate issueDate;
    private BigDecimal totalAmount;
}
