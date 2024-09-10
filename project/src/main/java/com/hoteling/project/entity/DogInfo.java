package com.hoteling.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "Dog_info")
public class DogInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dogId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(length = 20)
    private String dogName;

    @Enumerated(EnumType.STRING)
    @Column
    private DogGender dogGender;

    @Column
    private LocalDate dogBirth;

    @Column
    private Boolean neutered;

    @Column(columnDefinition = "TEXT")
    private String additionalInfo;

    // Enum for dog gender
    public enum DogGender {
        MALE, FEMALE
    }
}
