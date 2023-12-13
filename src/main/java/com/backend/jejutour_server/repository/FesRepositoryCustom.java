package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.FesEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface FesRepositoryCustom {
    List<FesEntity> findFesByGPS(Double lat, Double lnt);
}
