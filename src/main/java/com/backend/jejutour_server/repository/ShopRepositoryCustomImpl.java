package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.ShopEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class ShopRepositoryCustomImpl implements ShopRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    // 위도 경도 +- 0.02 내의 데이터 조회 범위 예( 32.98, 33.02 / 119.98 , 120.02 )
//    public List<ShopEntity> findShopsByGPS(Double lat, Double lnt) {
//        String jpql = "SELECT t FROM ShopEntity t WHERE t.itemsLatitude BETWEEN :minLat AND :maxLat AND t.itemsLongitude BETWEEN :minLnt AND :maxLnt";
//        TypedQuery<ShopEntity> query = entityManager.createQuery(jpql, ShopEntity.class);
//        query.setParameter("minLat", lat - 0.05);
//        query.setParameter("maxLat", lat + 0.05);
//        query.setParameter("minLnt", lnt - 0.05);
//        query.setParameter("maxLnt", lnt + 0.05);
//
//        return query.getResultList();
//    }


    // 위도 경도 기준 n Km 내에 있는 데이터 조회하는 Query
    public List<ShopEntity> findShopsByGPS(Double lat, Double lnt) {
        // 3km를 미터 단위로 변환
        double radius = 4500; // 4.5km

        String jpql = "SELECT t FROM ShopEntity t WHERE ST_Distance_Sphere(point(t.itemsLongitude, t.itemsLatitude), point(:lnt, :lat)) <= :radius";
        TypedQuery<ShopEntity> query = entityManager.createQuery(jpql, ShopEntity.class);
        query.setParameter("lat", lat);
        query.setParameter("lnt", lnt);
        query.setParameter("radius", radius);

        return query.getResultList();
    }
}