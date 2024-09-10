package com.hoteling.project.Main.service;

import com.hoteling.project.Main.repository.MainRepository;
import com.hoteling.project.entity.Hoteling;
import com.hoteling.project.Main.dto.MainDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MainService {

    @Autowired
    private MainRepository mainRepository;

    public List<Hoteling> searchHotels(MainDTO mainDTO) {
        // 체크아웃 날짜가 체크인 날짜보다 이전일 경우 예외 발생
        if (mainDTO.getCheckInDate() != null &&
                mainDTO.getCheckOutDate() != null &&
                mainDTO.getCheckInDate().isAfter(mainDTO.getCheckOutDate())) {

            throw new IllegalArgumentException("체크아웃 날짜는 체크인 날짜보다 빠를 수 없습니다.");
        }

        LocalDate checkIn = mainDTO.getCheckInDate();
        LocalDate checkOut = mainDTO.getCheckOutDate();
        LocalDate dogBirth = mainDTO.getDogBirth();

        return mainRepository.findAvailableHotels(checkIn, checkOut, dogBirth);
    }
}
