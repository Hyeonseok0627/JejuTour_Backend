package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.dto.ResDto;
import com.backend.jejutour_server.entity.ResEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResRepository extends JpaRepository<ResEntity, Integer>, ResRepositoryCustom {
    List<ResEntity> findByItemsRegion2CdValue(Long region2cd_label);
}
