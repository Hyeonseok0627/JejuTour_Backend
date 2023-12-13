package com.backend.jejutour_server.service;

import com.backend.jejutour_server.dto.ResDto;
import com.backend.jejutour_server.entity.ResEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface ResService {

    public List<ResEntity> getAllResList();

    public List<ResEntity> getItemsRegion2CdValueResList(Long itemsRegion2CdValue);

    public List<ResEntity> findResByGPS(Double lat, Double lnt);

}
