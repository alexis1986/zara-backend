package com.alexdevvv.zara.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class PriceDto {

    private Integer productId;
    private Integer brandId;
    private Integer priceList;
    private LocalDateTime date;
    private BigDecimal price;
}
