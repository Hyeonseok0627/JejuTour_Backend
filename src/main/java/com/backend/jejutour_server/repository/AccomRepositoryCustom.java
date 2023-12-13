package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.AccomEntity;
import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;

public interface AccomRepositoryCustom {
    List<AccomEntity> findAccomsByGPS(Double lat, Double lnt);
}
