package com.hoteling.project.reservation.dto;

import java.math.BigDecimal;

public class ReservationDTO {

    private Integer hotelingId;
    private String hName;
    private BigDecimal hPrice;

    // All-args constructor
    public ReservationDTO(Integer hotelingId, String hName, BigDecimal hPrice) {
        this.hotelingId = hotelingId;
        this.hName = hName;
        this.hPrice = hPrice;
    }

    // Getters and Setters
    public Integer getHotelingId() {
        return hotelingId;
    }

    public void setHotelingId(Integer hotelingId) {
        this.hotelingId = hotelingId;
    }

    public String getHName() {
        return hName;
    }

    public void setHName(String hName) {
        this.hName = hName;
    }

    public BigDecimal getHPrice() {
        return hPrice;
    }

    public void setHPrice(BigDecimal hPrice) {
        this.hPrice = hPrice;
    }
}
