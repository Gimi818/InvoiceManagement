package com.invoicemanagement.buyer;


import com.invoicemanagement.buyer.dto.BuyerRequestDto;
import com.invoicemanagement.buyer.dto.BuyerResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface BuyerMapper {


    BuyerMapper sellerMapper = Mappers.getMapper(BuyerMapper.class);

    BuyerResponseDto entityToDto(Buyer buyer);

    Buyer dtoToEntity(BuyerRequestDto buyerRequestDto);

}
