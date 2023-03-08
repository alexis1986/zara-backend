package com.alexdevvv.zara.controller;

import com.alexdevvv.zara.dto.PriceDto;
import com.alexdevvv.zara.service.PriceService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/zara/api")
public class ZaraController {
    private final PriceService priceService;

    public ZaraController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/find/price")
    public ResponseEntity<PriceDto> get(@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime date,
                                          @RequestParam("productId") int productId,
                                          @RequestParam("brandId") int brandId) {
        PriceDto priceDto = priceService.findByDateAndProductIdAndBrandId(date, productId, brandId);

        if (priceDto != null) {
            return ResponseEntity.ok(priceDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
