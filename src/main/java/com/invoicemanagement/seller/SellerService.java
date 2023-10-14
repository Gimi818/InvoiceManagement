package com.invoicemanagement.seller;


import com.invoicemanagement.invoice.Invoice;
import com.invoicemanagement.invoice.dto.InvoiceResponseDto;
import com.invoicemanagement.seller.dto.SellerRequestDto;
import com.invoicemanagement.seller.dto.SellerResponseDto;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class SellerService {

    private final SellerRepository repository;
    private final SellerMapper mapper;


    public Seller saveSeller(SellerRequestDto sellerRequestDto) {

        Seller seller = repository.save(mapper.dtoToEntity(sellerRequestDto));

        return seller;
    }



    public SellerResponseDto findSellerById(Long id) {
        Seller seller = repository.findById(id).orElseThrow();
        return mapper.entityToDto(seller);
    }

}
