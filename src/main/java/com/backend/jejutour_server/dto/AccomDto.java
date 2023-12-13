package com.backend.jejutour_server.dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class AccomDto {


    private String alltag;
    private String contentsid;
    private String contentscdValue;
    private String contentscdLabel;
    private String contentscdRefId;
    private String title;
    private String region1cd;
    private String region2cd;
    private String region1cdValue;
    private String region1cdLabel;
    private String region1cdRefId;
    private long region2cdValue;
    private String region2cdLabel;
    private String region2cdRefId;
    private String address;
    private String roadAddress;
    private String tag;
    private String introduction;
    private String latitude;
    private String longitude;
    private String postcode;
    private String phoneNo;
    private String repPhotoDescSeo;
    private long repPhotoPhotoidPhotoid;
    private String repPhotoPhotoidImgPath;
    private String repPhotoPhotoidThumbnailPath;

    private static ModelMapper modelMapper = new ModelMapper();
}
