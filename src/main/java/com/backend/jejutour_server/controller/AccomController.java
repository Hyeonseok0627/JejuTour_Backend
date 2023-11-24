package com.backend.jejutour_server.controller;


import com.backend.jejutour_server.entity.AccomEntity;
import com.backend.jejutour_server.service.AccomService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@Log4j2
@RestController
@RequestMapping("/accom")
public class AccomController {

    @Autowired
    private AccomService accomService;

    // 전체 출력
    @GetMapping("/accomAllList")
    public List<AccomEntity> AccomList() {
        List<AccomEntity> accomList = accomService.getAllAccomList();
        return accomList;
    }

    // 지역별 출력
    // /campList/지역코드
    @GetMapping("/accomList/{itemsRegion2CdValue}")
    public List<AccomEntity> AccomItemsRegion2CdValueList(@PathVariable("itemsRegion2CdValue") Long itemsRegion2CdValue) throws UnsupportedEncodingException {

        String regionName;

        switch (itemsRegion2CdValue.intValue()) {
            case 11:
                regionName = "제주시내";
                break;
            case 12:
                regionName = "애월";
                break;
            case 13:
                regionName = "한림";
                break;
            case 14:
                regionName = "한경";
                break;
            case 15:
                regionName = "조천";
                break;
            case 16:
                regionName = "구좌";
                break;
            case 17:
                regionName = "성산";
                break;
            case 21:
                regionName = "서귀포시내";
                break;
            case 22:
                regionName = "대정";
                break;
            case 23:
                regionName = "안덕";
                break;
            case 24:
                regionName = "중문";
                break;
            case 25:
                regionName = "남원";
                break;
            case 26:
                regionName = "표선";
                break;
            case 31:
                regionName = "우도";
                break;
            case 32:
                regionName = "추자도";
                break;
            case 33:
                regionName = "마라도";
                break;
        }
            List<AccomEntity> accomList = accomService.getitemsRegion2CdValueAccomList(itemsRegion2CdValue);

            return accomList;
        }
    }
