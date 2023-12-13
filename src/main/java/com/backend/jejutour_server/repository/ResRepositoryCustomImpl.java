package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.ResEntity;
import com.backend.jejutour_server.entity.TourEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class ResRepositoryCustomImpl implements ResRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    // 위도 경도 +- 0.02 내의 데이터 조회 범위 예( 32.98, 33.02 / 119.98 , 120.02 )
//    public List<TourEntity> findToursByGPS(Double lat, Double lnt) {
//        String jpql = "SELECT t FROM TourEntity t WHERE t.itemsLatitude BETWEEN :minLat AND :maxLat AND t.itemsLongitude BETWEEN :minLnt AND :maxLnt";
//        TypedQuery<TourEntity> query = entityManager.createQuery(jpql, TourEntity.class);
//        query.setParameter("minLat", lat - 0.05);
//        query.setParameter("maxLat", lat + 0.05);
//        query.setParameter("minLnt", lnt - 0.05);
//        query.setParameter("maxLnt", lnt + 0.05);
//
//        return query.getResultList();
//    }


    // 위도 경도 기준 n Km 내에 있는 데이터 조회하는 Query
    public List<ResEntity> findResByGPS(Double lat, Double lnt) {
        // 3km를 미터 단위로 변환
        double radius = 4500; // 4.5km

        String jpql = "SELECT t FROM TourEntity t WHERE ST_Distance_Sphere(point(t.itemsLongitude, t.itemsLatitude), point(:lnt, :lat)) <= :radius";
        TypedQuery<ResEntity> query = entityManager.createQuery(jpql, ResEntity.class);
        query.setParameter("lat", lat);
        query.setParameter("lnt", lnt);
        query.setParameter("radius", radius);

        return query.getResultList();
    }
}