package com.hoteling.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "hotelings")
public class Hoteling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hoteling_id")
    private Integer hotelingId;

    @Column(name = "business_user_id", nullable = false)
    private Integer businessUserId;

    @Column(name = "h_name", nullable = false)
    private String hName;

    @Column(name = "h_price", nullable = false)
    private BigDecimal hPrice;

    @Column(name = "h_totaldogs", nullable = false)
    private Integer hTotaldogs;

    @Column(name = "h_max", nullable = false)
    private Integer hMax;

    @Column(name = "h_info", nullable = false)
    private String hInfo;

    @Column(name = "h_check_in", nullable = false)
    private Timestamp hCheckIn;

    @Column(name = "h_check_out", nullable = false)
    private Timestamp hCheckOut;

    @Column(name = "h_availability", nullable = false)
    private Boolean hAvailability;

    @Column(name = "h_question")
    private String hQuestion;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)  // DogInfo의 dog_id와 연결
    private DogInfo dogInfo;

    // Getters and Setters

    public Integer getHotelingId() {
        return hotelingId;
    }

    public void setHotelingId(Integer hotelingId) {
        this.hotelingId = hotelingId;
    }

    public Integer getBusinessUserId() {
        return businessUserId;
    }

    public void setBusinessUserId(Integer businessUserId) {
        this.businessUserId = businessUserId;
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

    public Integer getHTotaldogs() {
        return hTotaldogs;
    }

    public void setHTotaldogs(Integer hTotaldogs) {
        this.hTotaldogs = hTotaldogs;
    }

    public Integer getHMax() {
        return hMax;
    }

    public void setHMax(Integer hMax) {
        this.hMax = hMax;
    }

    public String getHInfo() {
        return hInfo;
    }

    public void setHInfo(String hInfo) {
        this.hInfo = hInfo;
    }

    public Timestamp getHCheckIn() {
        return hCheckIn;
    }

    public void setHCheckIn(Timestamp hCheckIn) {
        this.hCheckIn = hCheckIn;
    }

    public Timestamp getHCheckOut() {
        return hCheckOut;
    }

    public void setHCheckOut(Timestamp hCheckOut) {
        this.hCheckOut = hCheckOut;
    }

    public Boolean getHAvailability() {
        return hAvailability;
    }

    public void setHAvailability(Boolean hAvailability) {
        this.hAvailability = hAvailability;
    }

    public String getHQuestion() {
        return hQuestion;
    }

    public void setHQuestion(String hQuestion) {
        this.hQuestion = hQuestion;
    }

    public DogInfo getDogInfo() {
        return dogInfo;
    }

    public void setDogInfo(DogInfo dogInfo) {
        this.dogInfo = dogInfo;
    }
}
