package com.hoteling.project.reservation.dto;

import java.math.BigDecimal;

public class ReservationSearchListDTO {

    private String hotelName;
    private BigDecimal hotelPrice;
    private String hotelInfo;

    // Constructor
    public ReservationSearchListDTO(String hotelName, BigDecimal hotelPrice, String hotelInfo) {
        this.hotelName = hotelName;
        this.hotelPrice = hotelPrice;
        this.hotelInfo = hotelInfo;
    }

    // Getters and Setters
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public BigDecimal getHotelPrice() {
        return hotelPrice;
    }

    public void setHotelPrice(BigDecimal hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public String getHotelInfo() {
        return hotelInfo;
    }

    public void setHotelInfo(String hotelInfo) {
        this.hotelInfo = hotelInfo;
    }
}
