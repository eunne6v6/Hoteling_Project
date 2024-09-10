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
@Table(name = "business_users")
public class BusinessUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "business_user_id")
    private Integer businessUserId;

    @Column(name = "bu_id", nullable = false)
    private String buId;

    @Column(name = "bu_pw", nullable = false)
    private String buPw;

    @Column(name = "bu_name", nullable = false)
    private String buName;

    @Column(name = "bu_ssn", nullable = false)
    private String buSsn;

    @Column(name = "business_name", nullable = false)
    private String businessName;

    @Column(name = "business_reg_no", nullable = false)
    private String businessRegNo;

    @Column(name = "business_address", nullable = false)
    private String businessAddress;

    @Column(name = "business_email", nullable = false)
    private String businessEmail;

    @Column(name = "business_num", nullable = false)
    private String businessNum;

    @Enumerated(EnumType.STRING)
    @Column(name = "bu_role", nullable = false)
    private UserRole buRole;

    @Column(name = "bu_create_at")
    private Timestamp buCreateAt;

    public enum UserRole {
        USER, BUSINESS, ADMIN
    }
}
