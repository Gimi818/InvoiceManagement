package com.invoicemanagement.invoice;

import com.invoicemanagement.invoice.dto.InvoiceRequestDto;
import com.invoicemanagement.invoice.dto.InvoiceResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface InvoiceMapper {

    InvoiceMapper invoiceMapper = Mappers.getMapper(InvoiceMapper.class);


    InvoiceResponseDto entityToDto(Invoice invoice);

    Invoice dtoToEntity(InvoiceRequestDto invoiceRequestDto);
}
