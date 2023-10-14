package com.invoicemanagement.seller;


import com.invoicemanagement.invoice.dto.InvoiceResponseDto;
import com.invoicemanagement.seller.dto.SellerRequestDto;
import com.invoicemanagement.seller.dto.SellerResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sellers")
public class SellerController {
    private final SellerService service;


    @PostMapping("/add")
    public ResponseEntity<Seller> saveSeller(@RequestBody SellerRequestDto sellerRequestDto) {
        return new ResponseEntity<>(service.saveSeller(sellerRequestDto), HttpStatus.CREATED);
    }




    @GetMapping("/{id}")
    public ResponseEntity<SellerResponseDto> findSellerById(@PathVariable Long id) {
        SellerResponseDto sellerResponseDto = service.findSellerById(id);
        return ResponseEntity.status(HttpStatus.OK).body(sellerResponseDto);
    }

}
