package com.backend.jejutour_server.service;

import com.backend.jejutour_server.entity.TourEntity;
import com.backend.jejutour_server.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private TourRepository tourRepository;


    @Override
    public List<TourEntity> getAllTourList() {
        List<TourEntity> tourList = tourRepository.findAll();
        for (int i = 1; i < tourList.size(); i++) {

            System.out.println("Service camp facltNm: " + tourList.get(i));
        }
        return tourList;
    }

    @Override
    public TourEntity getTour(int tourid) {
        return null;
    }
}