package com.hoteling.project.Main.dto;

import java.time.LocalDate;

public class MainDTO {
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDate dogBirth;

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getDogBirth() {
        return dogBirth;
    }

    public void setDogBirth(LocalDate dogBirth) {
        this.dogBirth = dogBirth;
    }
}
