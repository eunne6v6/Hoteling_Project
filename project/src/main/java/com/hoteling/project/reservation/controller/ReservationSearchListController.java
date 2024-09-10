package com.hoteling.project.reservation.controller;

import com.hoteling.project.reservation.dto.ReservationSearchListDTO;
import com.hoteling.project.reservation.service.ReservationSearchListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationSearchListController {
    @Autowired
    private ReservationSearchListService reservationSearchListService;

    @GetMapping("/hotels/search")
    public ResponseEntity<Page<ReservationSearchListDTO>> searchHotels(
            @RequestParam String keyword,
            @RequestParam(defaultValue = "0") int page) {
        Page<ReservationSearchListDTO> searchResults = reservationSearchListService.searchHotels(keyword, page);
        return ResponseEntity.ok(searchResults);
    }
}
