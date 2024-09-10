package com.hoteling.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "u_id", nullable = false)
    private String uId;

    @Column(name = "u_pw", nullable = false)
    private String uPw;

    @Column(name = "u_name", nullable = false)
    private String uName;

    @Column(name = "u_ssn", nullable = false)
    private String uSsn;

    @Column(name = "u_phone_num", nullable = false)
    private String uPhoneNum;

    @Column(name = "u_email", nullable = false)
    private String uEmail;

    @Enumerated(EnumType.STRING)
    @Column(name = "u_role", nullable = false)
    private UserRole uRole;

    @Column(name = "u_create_at")
    private Timestamp uCreateAt;

    public enum UserRole {
        USER, BUSINESS, ADMIN
    }
}
