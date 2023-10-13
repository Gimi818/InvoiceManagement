package com.invoicemanagement.seller;


import com.invoicemanagement.seller.dto.SellerRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sellers")
public class SellerController {
    private final SellerService service;


    @PostMapping("/add")
    public ResponseEntity<Seller> saveSeller(@RequestBody SellerRequestDto sellerRequestDto) {
        return new ResponseEntity<>(service.saveSeller(sellerRequestDto), HttpStatus.CREATED);
    }
}
