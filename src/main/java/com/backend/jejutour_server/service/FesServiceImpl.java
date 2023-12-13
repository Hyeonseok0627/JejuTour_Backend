package com.backend.jejutour_server.service;


import com.backend.jejutour_server.entity.FesEntity;
import com.backend.jejutour_server.entity.TourEntity;
import com.backend.jejutour_server.repository.FesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FesServiceImpl implements FesService{

    @Autowired
    private FesRepository fesRepository;


    @Override
    public List<FesEntity> getAllFesList() {
        List<FesEntity> fesList = fesRepository.findAll();
        for (int i = 1; i < fesList.size(); i++) {

            System.out.println("Service fes facltNm: " + fesList.get(i));
        }
        return fesList;
    }

    @Override
    public FesEntity getFes(int fesid) {
        return null;
    }

    @Override
    public List<FesEntity> getitemsRegion2CdValueFesList(Long itemsRegion2CdValue) {
        List<FesEntity> fesList = fesRepository.findByItemsRegion2CdValue(itemsRegion2CdValue);
        for (int i = 1; i < fesList.size(); i++) {
            System.out.println("Service fes facltNm: " + fesList.get(i));
        }
        return fesList;
    }

    @Override
    public List<FesEntity> findFesByGPS(Double lat, Double lnt) {
        List<FesEntity> fesList = fesRepository.findFesByGPS(lat,lnt);
        return fesList;
    }


}