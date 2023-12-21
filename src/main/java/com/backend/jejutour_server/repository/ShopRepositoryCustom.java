package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.ShopEntity;
import com.backend.jejutour_server.entity.TourEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShopRepositoryCustom {
    Page<ShopEntity> findShopsByGPS(Double lat, Double lnt, Pageable pageable);
}
