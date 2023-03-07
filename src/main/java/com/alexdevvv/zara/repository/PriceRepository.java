package com.alexdevvv.zara.repository;

import com.alexdevvv.zara.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

    @Query(value = "SELECT * " +
            "   FROM prices " +
            "       WHERE ?1 BETWEEN start_date AND end_date " +
            "       AND product_id = ?2" +
            "       AND brand_id = ?3" +
            "   ORDER BY priority DESC" +
            "   LIMIT 1", nativeQuery = true)
    Price findByDateAndProductIdAndBrandId(LocalDateTime date, Integer productId, Integer brandId);

}
