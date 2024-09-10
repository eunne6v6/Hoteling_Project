package com.hoteling.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "hoteling_reservations")
public class HotelingReservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_res_id")
    private Integer hotelResId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "dog_id", nullable = false) // 수정 필요
    private DogInfo dogInfo;

    @ManyToOne
    @JoinColumn(name = "hoteling_id", nullable = false) // 수정 필요
    private Hoteling hoteling;

    @Column(name = "res_date", nullable = false)
    private LocalDate resDate;

    @Column(name = "res_check_in", nullable = false)
    private LocalDate resCheckIn;

    @Column(name = "res_check_out", nullable = false)
    private LocalDate resCheckOut;

    @Enumerated(EnumType.STRING)
    @Column(name = "res_state")
    private ReservationState resState;

    @Column(name = "res_dogs", nullable = false)
    private Integer resDogs;

    @Column(name = "total_price")
    private BigDecimal totalPrice;

    public enum ReservationState {
        PENDING, COMPLETED, CANCELLED
    }
}
