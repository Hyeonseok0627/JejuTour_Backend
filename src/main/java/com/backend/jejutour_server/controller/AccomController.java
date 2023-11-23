package com.backend.jejutour_server.controller;


import com.backend.jejutour_server.entity.AccomEntity;
import com.backend.jejutour_server.service.AccomService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accom")
@RequiredArgsConstructor
public class AccomController {

    @Autowired
    private AccomService accomService;

    // 전체 출력
    @GetMapping("/accomAllList")
    public String AccomList(Model model) {
        List<AccomEntity> accomList = accomService.getAllAccomList();

        return accomList.toString();
    }
}
