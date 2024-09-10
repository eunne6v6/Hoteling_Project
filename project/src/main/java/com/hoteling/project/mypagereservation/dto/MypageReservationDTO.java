//package com.hoteling.project.mypagereservation.dto;
//
//import java.math.BigDecimal;
//import java.time.LocalDate;
//
//public class MypageReservationDTO {
//    private Integer hotelResId;
//    private Integer userId;
//    private LocalDate resCheckIn;
//    private LocalDate resCheckOut;
//    private ReservationState resState;
//    private Integer resDogs;
//    private BigDecimal totalPrice;
//    private LocalDate paymentDate;
//    private BigDecimal amount;
//    private PaymentMethod paymentMethod;
//    private TransactionType transactionType;
//    private String dogName;
//    private DogGender dogGender;
//    private LocalDate dogBirth;
//    private Boolean neutered;
//    private String additionalInfo;
//    private String uName;
//    private String uPhoneNum;
//
//    public MypageReservationDTO(Integer hotelResId, Integer userId, LocalDate resCheckIn, LocalDate resCheckOut,
//                                ReservationState resState, Integer resDogs, BigDecimal totalPrice, LocalDate paymentDate,
//                                BigDecimal amount, PaymentMethod paymentMethod, TransactionType transactionType,
//                                String dogName, DogGender dogGender, LocalDate dogBirth, Boolean neutered,
//                                String additionalInfo, String uName, String uPhoneNum) {
//        this.hotelResId = hotelResId;
//        this.userId = userId;
//        this.resCheckIn = resCheckIn;
//        this.resCheckOut = resCheckOut;
//        this.resState = resState;
//        this.resDogs = resDogs;
//        this.totalPrice = totalPrice;
//        this.paymentDate = paymentDate;
//        this.amount = amount;
//        this.paymentMethod = paymentMethod;
//        this.transactionType = transactionType;
//        this.dogName = dogName;
//        this.dogGender = dogGender;
//        this.dogBirth = dogBirth;
//        this.neutered = neutered;
//        this.additionalInfo = additionalInfo;
//        this.uName = uName;
//        this.uPhoneNum = uPhoneNum;
//    }
//
//    // Getters and Setters
//
//    public Integer getHotelResId() {
//        return hotelResId;
//    }
//
//    public void setHotelResId(Integer hotelResId) {
//        this.hotelResId = hotelResId;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
//
//    public LocalDate getResCheckIn() {
//        return resCheckIn;
//    }
//
//    public void setResCheckIn(LocalDate resCheckIn) {
//        this.resCheckIn = resCheckIn;
//    }
//
//    public LocalDate getResCheckOut() {
//        return resCheckOut;
//    }
//
//    public void setResCheckOut(LocalDate resCheckOut) {
//        this.resCheckOut = resCheckOut;
//    }
//
//    public ReservationState getResState() {
//        return resState;
//    }
//
//    public void setResState(ReservationState resState) {
//        this.resState = resState;
//    }
//
//    public Integer getResDogs() {
//        return resDogs;
//    }
//
//    public void setResDogs(Integer resDogs) {
//        this.resDogs = resDogs;
//    }
//
//    public BigDecimal getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(BigDecimal totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public LocalDate getPaymentDate() {
//        return paymentDate;
//    }
//
//    public void setPaymentDate(LocalDate paymentDate) {
//        this.paymentDate = paymentDate;
//    }
//
//    public BigDecimal getAmount() {
//        return amount;
//    }
//
//    public void setAmount(BigDecimal amount) {
//        this.amount = amount;
//    }
//
//    public PaymentMethod getPaymentMethod() {
//        return paymentMethod;
//    }
//
//    public void setPaymentMethod(PaymentMethod paymentMethod) {
//        this.paymentMethod = paymentMethod;
//    }
//
//    public TransactionType getTransactionType() {
//        return transactionType;
//    }
//
//    public void setTransactionType(TransactionType transactionType) {
//        this.transactionType = transactionType;
//    }
//
//    public String getDogName() {
//        return dogName;
//    }
//
//    public void setDogName(String dogName) {
//        this.dogName = dogName;
//    }
//
//    public DogGender getDogGender() {
//        return dogGender;
//    }
//
//    public void setDogGender(DogGender dogGender) {
//        this.dogGender = dogGender;
//    }
//
//    public LocalDate getDogBirth() {
//        return dogBirth;
//    }
//
//    public void setDogBirth(LocalDate dogBirth) {
//        this.dogBirth = dogBirth;
//    }
//
//    public Boolean getNeutered() {
//        return neutered;
//    }
//
//    public void setNeutered(Boolean neutered) {
//        this.neutered = neutered;
//    }
//
//    public String getAdditionalInfo() {
//        return additionalInfo;
//    }
//
//    public void setAdditionalInfo(String additionalInfo) {
//        this.additionalInfo = additionalInfo;
//    }
//
//    public String getUName() {
//        return uName;
//    }
//
//    public void setUName(String uName) {
//        this.uName = uName;
//    }
//
//    public String getUPhoneNum() {
//        return uPhoneNum;
//    }
//
//    public void setUPhoneNum(String uPhoneNum) {
//        this.uPhoneNum = uPhoneNum;
//    }
//
//    // Enums
//
//    public enum ReservationState {
//        PENDING, COMPLETED, CANCELLED
//    }
//
//    public enum PaymentMethod {
//        CREDIT_CARD, KAKAPPAY, BANK_TRANSFER
//    }
//
//    public enum TransactionType {
//        PAYMENT, REFUND
//    }
//
//    public enum DogGender {
//        MALE, FEMALE
//    }
//}
