package com.alexdevvv.zara;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest
@AutoConfigureMockMvc
class ZaraApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test1() throws Exception {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 10, 0);
        int productId = 35455;
        int brandId = 1;
        int priceList = 1;
        BigDecimal price = new BigDecimal("35.5");

        mockMvc.perform(get("/zara/api/find/price?date={date}&productId={productId}&brandId={brandId}", date, productId, brandId)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(productId))
                .andExpect(jsonPath("$.brandId").value(brandId))
                .andExpect(jsonPath("$.priceList").value(priceList))
                .andExpect(jsonPath("$.date").value(date.format(DateTimeFormatter.ISO_DATE_TIME)))
                .andExpect(jsonPath("$.price").value(price));
    }

    @Test
    public void test2() throws Exception {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 16, 0);
        int productId = 35455;
        int brandId = 1;
        int priceList = 2;
        BigDecimal price = new BigDecimal("25.45");

        mockMvc.perform(get("/zara/api/find/price?date={date}&productId={productId}&brandId={brandId}", date, productId, brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(productId))
                .andExpect(jsonPath("$.brandId").value(brandId))
                .andExpect(jsonPath("$.priceList").value(priceList))
                .andExpect(jsonPath("$.date").value(date.format(DateTimeFormatter.ISO_DATE_TIME)))
                .andExpect(jsonPath("$.price").value(price));
    }

    @Test
    public void test3() throws Exception {
        LocalDateTime date = LocalDateTime.of(2020, 6, 14, 21, 0);
        int productId = 35455;
        int brandId = 1;
        int priceList = 1;
        BigDecimal price = new BigDecimal("35.5");

        mockMvc.perform(get("/zara/api/find/price?date={date}&productId={productId}&brandId={brandId}", date, productId, brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(productId))
                .andExpect(jsonPath("$.brandId").value(brandId))
                .andExpect(jsonPath("$.priceList").value(priceList))
                .andExpect(jsonPath("$.date").value(date.format(DateTimeFormatter.ISO_DATE_TIME)))
                .andExpect(jsonPath("$.price").value(price));
    }

    @Test
    public void test4() throws Exception {
        LocalDateTime date = LocalDateTime.of(2020, 6, 15, 10, 0);
        int productId = 35455;
        int brandId = 1;
        int priceList = 3;
        BigDecimal price = new BigDecimal("30.5");

        mockMvc.perform(get("/zara/api/find/price?date={date}&productId={productId}&brandId={brandId}", date, productId, brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(productId))
                .andExpect(jsonPath("$.brandId").value(brandId))
                .andExpect(jsonPath("$.priceList").value(priceList))
                .andExpect(jsonPath("$.date").value(date.format(DateTimeFormatter.ISO_DATE_TIME)))
                .andExpect(jsonPath("$.price").value(price));
    }

    @Test
    public void test5() throws Exception {
        LocalDateTime date = LocalDateTime.of(2020, 6, 16, 21, 0);
        int productId = 35455;
        int brandId = 1;
        int priceList = 4;
        BigDecimal price = new BigDecimal("38.95");

        mockMvc.perform(get("/zara/api/find/price?date={date}&productId={productId}&brandId={brandId}", date, productId, brandId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.productId").value(productId))
                .andExpect(jsonPath("$.brandId").value(brandId))
                .andExpect(jsonPath("$.priceList").value(priceList))
                .andExpect(jsonPath("$.date").value(date.format(DateTimeFormatter.ISO_DATE_TIME)))
                .andExpect(jsonPath("$.price").value(price));
    }
}
