package com.backend.jejutour_server.service;

import com.backend.jejutour_server.entity.TourEntity;

import java.util.List;


public interface TourService {

    public List<TourEntity> getAllTourList();
    public TourEntity getTour(int tourid);



}