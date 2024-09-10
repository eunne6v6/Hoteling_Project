package com.hoteling.project.Main.controller;

import com.hoteling.project.Main.dto.MainDTO;
import com.hoteling.project.Main.service.MainService;
import com.hoteling.project.entity.Hoteling;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("/main")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    public String main() {
        return "main"; // main.html 템플릿을 반환
    }

    @PostMapping("/reservation_list")
    public String searchHotels(MainDTO reservationSearchListDTO, Model model) {
        try {
            List<Hoteling> hotels = mainService.searchHotels(reservationSearchListDTO);
            model.addAttribute("hotels", hotels);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            model.addAttribute("errorMessage", "검색 중 오류가 발생했습니다. 관리자에게 문의하세요.");
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errorMessage", "예기치 않은 오류가 발생했습니다. 관리자에게 문의하세요.");
        }
        return "reservation_list";
    }
}
