package com.backend.jejutour_server.service;

import com.backend.jejutour_server.entity.AccomEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface AccomService {

    public List<AccomEntity> getAllAccomList();

    public List<AccomEntity> getitemsRegion2CdValueAccomList(Long itemsRegion2cdValue);

    public List<AccomEntity> findAccomsByGPS(Double lat, Double lnt);

}