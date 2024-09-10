package com.hoteling.project.reservation.service;

import com.hoteling.project.reservation.dto.ReservationSearchListDTO;
import com.hoteling.project.reservation.repository.ReservationSearchListRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ReservationSearchListService {

    private final ReservationSearchListRepository reservationSearchListRepository;

    public ReservationSearchListService(ReservationSearchListRepository reservationSearchListRepository) {
        this.reservationSearchListRepository = reservationSearchListRepository;
    }

    public Page<ReservationSearchListDTO> searchHotels(String keyword, int page) {
        // 페이지당 15개의 결과를 표시
        PageRequest pageable = PageRequest.of(page, 15);
        return reservationSearchListRepository.searchHotelsByKeyword(keyword, pageable);
    }
}
