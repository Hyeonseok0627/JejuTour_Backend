package com.backend.jejutour_server.controller;

import com.backend.jejutour_server.entity.ResEntity;
import com.backend.jejutour_server.entity.TourEntity;
import com.backend.jejutour_server.service.ResService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/res")
public class ResController {

    @Autowired
    private ResService resService;

    // 전체 출력
    @GetMapping("/resAllList")
    public List<ResEntity> ResList() {
        List<ResEntity> resList = resService.getAllResList();
        return resList;
    }

    // 지역별 출력
    // /campList/지역코드
    @GetMapping("/resList/{itemsRegion2CdValue}")
    public List<ResEntity> ResItemsRegion2CdValueList(@PathVariable("itemsRegion2CdValue") Long itemsRegion2CdValue) throws UnsupportedEncodingException {

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

        List<ResEntity> resList = resService.getItemsRegion2CdValueResList(itemsRegion2CdValue);
        return resList;
    }

    @GetMapping("/resList/resByGPS")
    @ResponseBody
    public List<ResEntity> getResByGPS(
            @RequestParam(value = "lat") Double lat,
            @RequestParam(value = "lnt") Double lnt
    ) {
        System.out.println("lat : " + lat + "lnt : " + lnt );
        return resService.findResByGPS(lat, lnt);
    }


}
