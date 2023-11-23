package com.backend.jejutour_server.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Repository
@ToString
@Table(name = "tour")


public class TourEntity {

    @Id
    @Column(name="tourid")
    private int tourid;

    @Column(name = "items__alltag")
    private String allTag;

    @Column(name = "items__contentsid")
    private String contentsId;

    @Column(name = "items__contentscd__value")
    private String contentsCdValue;

    @Column(name = "items__contentscd__label")
    private String contentsCdLabel;

    @Column(name = "items__contentscd__refId")
    private String contentsCdRefId;

    @Column(name = "items__title")
    private String title;

    @Column(name = "items__region1cd__value")
    private String region1CdValue;

    @Column(name = "items__region1cd__label")
    private String region1CdLabel;

    @Column(name = "items__region1cd__refId")
    private String region1CdRefId;

    @Column(name = "items__region2cd__value")
    private Integer region2CdValue;

    @Column(name = "items__region2cd__label")
    private String region2CdLabel;

    @Column(name = "items__region2cd__refId")
    private String region2CdRefId;

    @Column(name = "items__address", columnDefinition = "TEXT")
    private String address;

    @Column(name = "items__roadaddress", columnDefinition = "TEXT")
    private String roadAddress;

    @Column(name = "items__tag", columnDefinition = "TEXT")
    private String tag;

    @Column(name = "items__introduction", columnDefinition = "TEXT")
    private String introduction;

    @Column(name = "items__latitude")
    private Double latitude;

    @Column(name = "items__longitude")
    private Double longitude;

    @Column(name = "items__postcode")
    private String postcode;

    @Column(name = "items__phoneno")
    private String phoneNo;

    @Column(name = "items__repPhoto__descseo", columnDefinition = "TEXT")
    private String repPhotoDescSeo;

    @Column(name = "items__repPhoto__photoid__photoid")
    private Long repPhotoPhotoId;

    @Column(name = "items__repPhoto__photoid__imgpath")
    private String repPhotoImgPath;

    @Column(name = "items__repPhoto__photoid__thumbnailpath")
    private String repPhotoThumbnailPath;




}
