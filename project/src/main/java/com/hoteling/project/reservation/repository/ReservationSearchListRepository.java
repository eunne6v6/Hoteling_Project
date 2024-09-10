package com.hoteling.project.reservation.repository;

import com.hoteling.project.entity.Hoteling;
import com.hoteling.project.reservation.dto.ReservationSearchListDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationSearchListRepository extends JpaRepository<Hoteling, Integer> {

    @Query("SELECT new com.hoteling.project.reservation.dto.ReservationSearchListDTO(h.hName, h.hPrice, h.hInfo) " +
            "FROM Hoteling h WHERE h.hName LIKE %:keyword% AND h.hAvailability = true")
    Page<ReservationSearchListDTO> searchHotelsByKeyword(String keyword, Pageable pageable);
}
