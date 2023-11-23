package com.backend.jejutour_server.controller;

import com.backend.jejutour_server.entity.TourEntity;
import com.backend.jejutour_server.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/tour")
public class TourController {

    @Autowired
    TourService tourService;


    @GetMapping("/tourAllList")
    public List<TourEntity> TourList() {
        List<TourEntity> tourList = tourService.getAllTourList();
        return tourList;
    }

}
