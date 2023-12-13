package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.AccomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccomRepository extends JpaRepository<AccomEntity, Integer>, AccomRepositoryCustom {

    List<AccomEntity> findByItemsRegion2CdValue(Long items_region2cd_value);
}