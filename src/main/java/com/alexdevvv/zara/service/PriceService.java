package com.alexdevvv.zara.service;

import com.alexdevvv.zara.dto.PriceDto;
import com.alexdevvv.zara.model.Price;
import com.alexdevvv.zara.repository.PriceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PriceService {
    private final PriceRepository repository;

    public PriceService(PriceRepository repository) {
        this.repository = repository;
    }

    public PriceDto findByDateAndProductIdAndBrandId(LocalDateTime date, Integer productId, Integer brandId) {
        PriceDto priceDto = null;

        Price price = this.repository.findByDateAndProductIdAndBrandId(date, productId, brandId);

        if (price != null) {
            priceDto = new PriceDto();
            priceDto.setProductId(productId);
            priceDto.setBrandId(brandId);
            priceDto.setDate(date);
            priceDto.setPriceList(price.getPriceList());
            priceDto.setPrice(price.getPrice());
        }

        return priceDto;
    }
}
