//package com.hoteling.project.mypagereservation.service;
//
//
//import com.hoteling.project.mypagereservation.dto.MypageReservationDTO;
//import com.hoteling.project.mypagereservation.repository.MypageReservationRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class MypageReservationService {
//
//    private static final Logger logger = LoggerFactory.getLogger(MypageReservationService.class);
//
//    private final MypageReservationRepository mypageReservationRepository;
//
//    @Autowired
//    public MypageReservationService(MypageReservationRepository mypageReservationRepository) {
//        this.mypageReservationRepository = mypageReservationRepository;
//    }
//
//    public List<MypageReservationDTO> getReservationsByUserId(Integer userId) {
//        try {
//            return mypageReservationRepository.findMypageReservationBy(userId);
//        } catch (Exception e) {
//            // Log the error using SLF4J
//            logger.error("Error occurred while fetching reservations for user ID: {}", userId, e);
//
//            // Optionally rethrow or handle the exception
//            throw e; // or handle it as per your application's requirements
//        }
//    }
//}
