package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface TourRepositoryCustom {
    List<TourEntity> findToursByGPS(Double lat, Double lnt);
}
