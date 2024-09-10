package com.hoteling.project.Main.repository;

import com.hoteling.project.entity.Hoteling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MainRepository extends JpaRepository<Hoteling, Integer> {
    @Query("SELECT h FROM Hoteling h JOIN h.dogInfo d WHERE h.hCheckIn < :checkInDate AND h.hCheckOut > :checkOutDate AND d.dogBirth = :dogBirth")
    List<Hoteling> findAvailableHotels(@Param("checkInDate") LocalDate checkInDate, @Param("checkOutDate") LocalDate checkOutDate, @Param("dogBirth") LocalDate dogBirth);

//    List<Hoteling> findByHCheckInBeforeAndHCheckOutAfterAndDogInfo_dogBirth(LocalDate checkInDate, LocalDate checkOutDate, LocalDate dogBirth);
}