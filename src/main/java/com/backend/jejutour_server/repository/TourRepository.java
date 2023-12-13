package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.TourEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface TourRepository extends JpaRepository<TourEntity,Integer>, TourRepositoryCustom {
//    @Query("select m.name from TourEntity m")
//    List<String> findNameList();

    // getAllTourList() 메소드 페이징 처리
    Page<TourEntity> findAll(Pageable pageable);

    // getItemsRegion2CdValueTourList() 메소드 페이징 처리
    Page<TourEntity> findByItemsRegion2CdValue(Long region2cdValue, Pageable pageable);

List<TourEntity> findByItemsRegion2CdValue(Long region2cd_label);
}