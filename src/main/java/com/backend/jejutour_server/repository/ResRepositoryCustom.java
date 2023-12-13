package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.ResEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface ResRepositoryCustom {
    List<ResEntity> findResByGPS(Double lat, Double lnt);
}
