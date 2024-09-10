package com.hoteling.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hoteling.project.reservation.service.ReservationService;
import com.hoteling.project.reservation.repository.ReservationRepository;
import com.hoteling.project.reservation.service.ReservationSearchListService;
import com.hoteling.project.reservation.repository.ReservationSearchListRepository;

@Configuration
public class AppConfig {

    @Bean
    public ReservationService reservationService(ReservationRepository reservationRepository) {
        return new ReservationService(reservationRepository);  // 생성자 주입 방식 사용
    }

    @Bean
    public ReservationSearchListService reservationSearchListService(ReservationSearchListRepository reservationSearchListRepository) {
        return new ReservationSearchListService(reservationSearchListRepository);
    }
}
