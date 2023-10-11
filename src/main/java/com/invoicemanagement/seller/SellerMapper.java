package com.invoicemanagement.seller;

import com.invoicemanagement.invoice.Invoice;
import com.invoicemanagement.invoice.dto.InvoiceRequestDto;
import com.invoicemanagement.invoice.dto.InvoiceResponseDto;
import com.invoicemanagement.seller.dto.SellerRequestDto;
import com.invoicemanagement.seller.dto.SellerResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface SellerMapper {

    SellerMapper sellerMapper = Mappers.getMapper(SellerMapper.class);

        SellerResponseDto entityToDto(Seller seller);

        Seller dtoToEntity (SellerRequestDto sellerRequestDto);

}
