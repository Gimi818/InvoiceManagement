package com.invoicemanagement.buyer;

import com.invoicemanagement.buyer.dto.BuyerResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BuyerService {
    private final BuyerRepository repository;
    private final BuyerMapper mapper;

    public BuyerResponseDto findBuyerById(Long id) {
        Buyer buyer = repository.findById(id).orElseThrow();
        return mapper.entityToDto(buyer);
    }

}
