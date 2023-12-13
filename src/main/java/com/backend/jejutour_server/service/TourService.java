package com.backend.jejutour_server.service;

import com.backend.jejutour_server.entity.TourEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface TourService {


    public List<TourEntity> findToursByGPS( Double lat, Double lnt);

    // getAllTourList() 메소드 페이징 처리
    Page<TourEntity> getAllTourList(Pageable pageable);

    // getItemsRegion2CdValueTourList() 메소드 페이징 처리
    Page<TourEntity> getItemsRegion2CdValueTourList(Long itemsRegion2CdValue, Pageable pageable);


}