package com.backend.jejutour_server.service;

import com.backend.jejutour_server.entity.FesEntity;
import com.backend.jejutour_server.entity.ShopEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface ShopService {
    public List<ShopEntity> getAllShopList();
    public ShopEntity getShop (int Shopid);

    public List<ShopEntity> getItemsRegion2CdValueShopList(Long itemsRegion2CdValue);

    public List<ShopEntity> findShopsByGPS(Double lat, Double lnt);
}


