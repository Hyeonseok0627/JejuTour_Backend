package com.backend.jejutour_server.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accommodation")
@Getter
@Setter
@ToString
public class AccomEntity {
    @Id
    private int id;
    @Column(columnDefinition = "text")
    private String itemsAllTag;
    @Column(columnDefinition = "text")
    private String itemsContentsId;
    @Column(columnDefinition = "text")
    private String itemsContentsCdValue;
    @Column(columnDefinition = "text")
    private String itemsContentsCdLabel;
    @Column(columnDefinition = "text")
    private String itemsContentsCdRefId;
    @Column(columnDefinition = "text")
    private String itemsTitle;
    @Column(columnDefinition = "text")
    private String itemsRegion1CdValue;
    @Column(columnDefinition = "text")
    private String itemsRegion1CdLabel;
    @Column(columnDefinition = "text")
    private String itemsRegion1CdRefId;
    @Column(columnDefinition = "text")
    private Long itemsRegion2CdValue;
    @Column(columnDefinition = "text")
    private String itemsRegion2CdLabel;
    @Column(columnDefinition = "text")
    private String itemsRegion2CdRefId;
    @Column(columnDefinition = "text")
    private String itemsAddress;
    @Column(columnDefinition = "text")
    private String itemsRoadAddress;
    @Column(columnDefinition = "text")
    private String itemsTag;
    @Column(columnDefinition = "text")
    private String itemsIntroduction;
    @Column(columnDefinition = "text")
    private Double itemsLatitude;
    @Column(columnDefinition = "text")
    private Double itemsLongitude;
    @Column(columnDefinition = "text")
    private String itemsPostcode;
    @Column(columnDefinition = "text")
    private String itemsPhoneNo;
    @Column(columnDefinition = "text")
    private String itemsRepPhoto;
    @Column(columnDefinition = "text")
    private String itemsRepPhotoDescSeo;
    @Column(columnDefinition = "text")
    private String itemsRepPhotoPhotoIdPhotoId;
    @Column(columnDefinition = "text")
    private String itemsRepPhotoPhotoIdImgPath;
    @Column(columnDefinition = "text")
    private String itemsRepPhotoPhotoIdThumbnailPath;
}