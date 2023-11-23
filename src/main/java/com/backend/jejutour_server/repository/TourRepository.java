package com.backend.jejutour_server.repository;

import com.backend.jejutour_server.entity.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<TourEntity,Integer> {
//    @Query("select m.name from TourEntity m")
//    List<String> findNameList();

}
