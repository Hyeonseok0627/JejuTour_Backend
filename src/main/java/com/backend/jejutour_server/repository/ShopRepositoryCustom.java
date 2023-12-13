package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.ShopEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface ShopRepositoryCustom {
    List<ShopEntity> findShopsByGPS(Double lat, Double lnt);
}
