package com.hoteling.project.reservation.controller;

import com.hoteling.project.reservation.dto.ReservationDTO;
import com.hoteling.project.reservation.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservation_list")
    public String getAvailableHotels(
            @RequestParam(defaultValue = "0") int page,
            Model model) {
        Page<ReservationDTO> hotels = reservationService.getAvailableHotels(page);
        model.addAttribute("hotels", hotels.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", hotels.getTotalPages());
        return "reservation_list";  // reservation_list.html 템플릿 반환
    }
}
