package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.FesEntity;
import com.backend.jejutour_server.entity.ShopEntity;
import com.backend.jejutour_server.entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShopRepository extends JpaRepository<ShopEntity,Integer>, ShopRepositoryCustom {
    List<ShopEntity> findByItemsRegion2CdValue(Long region2cd_label);
}