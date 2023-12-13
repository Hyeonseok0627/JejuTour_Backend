package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.FesEntity;
import com.backend.jejutour_server.entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FesRepository extends JpaRepository<FesEntity,Integer>, FesRepositoryCustom {
    List<FesEntity> findByItemsRegion2CdValue(Long region2cd_label);
}
