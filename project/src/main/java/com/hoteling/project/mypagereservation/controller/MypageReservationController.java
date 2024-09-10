//package com.hoteling.project.mypagereservation.controller;
//
//import com.hoteling.project.mypagereservation.dto.MypageReservationDTO;
//import com.hoteling.project.mypagereservation.service.MypageReservationService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class MypageReservationController {
//
//    private static final Logger logger = LoggerFactory.getLogger(MypageReservationController.class);
//
//    @Autowired
//    private MypageReservationService mypageReservationService;
//
//    @GetMapping("/mypage/reservations")
//    public List<MypageReservationDTO> getReservations(@RequestParam("user_id") int user_id) {
//        try {
//            return mypageReservationService.getReservationsByUserId(user_id);
//        } catch (Exception e) {
//            // Log the error using SLF4J
//            logger.error("Error occurred while fetching reservations for user ID: {}", user_id, e);
//
//            // Optionally handle the exception or return an error response
//            throw e; // or handle it as per your application's requirements
//        }
//    }
//}
