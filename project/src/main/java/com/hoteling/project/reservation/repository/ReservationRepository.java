package com.hoteling.project.reservation.repository;

import com.hoteling.project.entity.Hoteling;
import com.hoteling.project.entity.HotelingReservation;
import com.hoteling.project.reservation.dto.ReservationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Hoteling, Integer> {

    @Query("SELECT new com.hoteling.project.reservation.dto.ReservationDTO(h.hotelingId, h.hName, h.hPrice) " +
            "FROM Hoteling h WHERE h.hAvailability = true")
    Page<ReservationDTO> findAvailableHotels(Pageable pageable);
}
