package com.backend.jejutour_server.controller;

import com.backend.jejutour_server.entity.TourEntity;
import com.backend.jejutour_server.service.TourService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

@Log4j2
@RestController
@RequestMapping("/tour")
public class TourController {

    @Autowired
    TourService tourService;


    @GetMapping("/tourAllList")
    public List<TourEntity> TourList() {
        List<TourEntity> tourList = tourService.getAllTourList();
        return tourList;
    }

    @GetMapping("/tourList/{itemsRegion2CdValue}")
    public List<TourEntity> TouritemsRegion2CdValueList(@PathVariable("itemsRegion2CdValue") Long itemsRegion2CdValue) throws UnsupportedEncodingException {

        // 지역 코드
//            case 11 : test = "제주시내"; break;
//            case 12 : test = "애월"; break;
//            case 13 : test = "한림"; break;
//            case 14 : test = "한경"; break;
//            case 15 : test = "조천"; break;
//            case 16 : test = "구좌"; break;
//            case 17 : test = "성산"; break;
//            case 21 : test = "서귀포시내"; break;
//            case 22 : test = "대정"; break;
//            case 23 : test = "안덕"; break;
//            case 24 : test = "중문"; break;
//            case 25 : test = "남원"; break;
//            case 26 : test = "표선"; break;
//            case 31 : test = "우도"; break;
//            case 32 : test = "추자도"; break;
//            case 33 : test = "마라도"; break;

        List<TourEntity> tourList = tourService.getItemsRegion2CdValueTourList(itemsRegion2CdValue);
        return tourList;
    }

    @GetMapping("/tourList/tourByGPS")
    @ResponseBody
    public List<TourEntity> getToursByGPS(
            @RequestParam(value = "lat") Double lat,
            @RequestParam(value = "lnt") Double lnt,
            @RequestParam(value = "page") int page
    ) {

        Pageable pageable = PageRequest.of( page, 5);
        Page<TourEntity> Tours = tourService.findToursByGPS(lat, lnt, pageable);

        System.out.println("통신 제대로 되나 확인 lat : " + lat + " lnt : " + lnt + " page : " + page);

        return Tours.getContent();
    }

}