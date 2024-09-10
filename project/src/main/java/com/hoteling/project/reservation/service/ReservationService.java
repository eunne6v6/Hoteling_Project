package com.hoteling.project.reservation.service;

import com.hoteling.project.reservation.dto.ReservationDTO;
import com.hoteling.project.reservation.repository.ReservationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class ReservationService {

    private final ReservationRepository reservationRepository;

    // 생성자 주입
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Page<ReservationDTO> getAvailableHotels(int page) {
        PageRequest pageable = PageRequest.of(page, 15);
        return reservationRepository.findAvailableHotels(pageable);
    }
}
