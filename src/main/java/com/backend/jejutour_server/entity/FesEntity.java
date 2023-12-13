package com.backend.jejutour_server.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

    @Entity
    @Getter
    @Setter
    @Repository
    @ToString
    @Table(name = "festival")
    public class FesEntity {

        @Id
        @Column(name = "festival_id")
        private Long festivalId;

        @Column(name = "items__alltag", length = 255)
        private String itemsAllTag;

        @Column(name = "items__contentsid", length = 255)
        private String itemsContentsid;

        @Column(name = "items__contentscd__value", length = 255)
        private String itemsContentsCdValue;

        @Column(name = "items__contentscd__label", length = 255)
        private String itemsContentsCdLabel;

        @Column(name = "items__contentscd__refId", length = 255)
        private String itemsContentsCdRefId;

        @Column(name = "items__title", length = 255)
        private String itemsTitle;

        @Column(name = "items__region1cd__value", length = 255)
        private String itemsRegion1CdValue;

        @Column(name = "items__region1cd__label", length = 255)
        private String itemsRegion1CdLabel;

        @Column(name = "items__region1cd__refId", length = 255)
        private String itemsRegion1CdRefId;

        @Column(name = "items__region2cd__value")
        private Long itemsRegion2CdValue;

        @Column(name = "items__region2cd__label", length = 255)
        private String itemsRegion2CdLabel;

        @Column(name = "items__region2cd__refId", length = 255)
        private String itemsRegion2CdRefId;

        @Column(name = "items__address", length = 255)
        private String itemsAddress;

        @Column(name = "items__roadaddress", length = 255)
        private String itemsRoadAddress;

        @Column(name = "items__tag", length = 255)
        private String itemsTag;

        @Column(name = "items__introduction", length = 500)
        private String itemsIntroduction;

        @Column(name = "items__latitude")
        private Double itemsLatitude;

        @Column(name = "items__longitude")
        private Double itemsLongitude;

        @Column(name = "items__postcode", length = 255)
        private String itemsPostcode;

        @Column(name = "items__phoneno", length = 255)
        private String itemsPhoneNo;

        @Column(name = "items__repPhoto__descseo", length = 255)
        private String itemsRepPhotoDescSeo;

        @Column(name = "items__repPhoto__photoid__photoid")
        private Long itemsRepPhotoPhotoidPhotoid;

        @Column(name = "items__repPhoto__photoid__imgpath", length = 255)
        private String itemsRepPhotoPhotoidImgPath;

        @Column(name = "items__repPhoto__photoid__thumbnailpath", length = 255)
        private String itemsRepPhotoPhotoidThumbnailPath;

    }


