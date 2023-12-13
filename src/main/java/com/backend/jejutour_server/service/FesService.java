package com.backend.jejutour_server.service;

import com.backend.jejutour_server.entity.FesEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface FesService {
    public List<FesEntity> getAllFesList();
    public FesEntity getFes (int Fesid);

    public List<FesEntity> getitemsRegion2CdValueFesList(Long itemsRegion2CdValue);

    public List<FesEntity> findFesByGPS(Double lat, Double lnt);
}