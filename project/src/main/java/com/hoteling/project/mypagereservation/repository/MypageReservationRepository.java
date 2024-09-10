//package com.hoteling.project.mypagereservation.repository;
//
//import com.hoteling.project.entity.HotelingReservation;
//import com.hoteling.project.mypagereservation.dto.MypageReservationDTO;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface MypageReservationRepository extends JpaRepository<HotelingReservation, Integer> {
//
//    @Query("SELECT new com.hoteling.project.mypagereservation.dto.MypageReservationDTO(" +
//            "r.hotelResId, r.user.userId, r.resCheckIn, r.resCheckOut, " +
//            "r.resDogs, r.totalPrice, " +
//            "p.paymentDate, p.amount, p.paymentMethod, p.transactionType, " +
//            "d.dogName, d.dogGender, d.dogBirth, d.neutered, d.additionalInfo, " +
//            "u.uName, u.uPhoneNum) " +
//            "FROM HotelingReservation r " +
//            "JOIN r.user u " +
//            "JOIN DogInfo d ON d.user.userId = u.userId " +
//            "LEFT JOIN PaymentInfo p ON r.hotelResId = p.hotelingReservation.hotelResId " +
//            "WHERE r.user.userId = :userId")
//    List<MypageReservationDTO> findMypageReservationBy(@Param("userId") Integer userId);
//}
