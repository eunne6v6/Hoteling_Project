package com.hoteling.project.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "hoteling_file")
public class HotelingFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hoteling_file_id")
    private Integer hotelingFileId;

    @Column(name = "hoteling_id", nullable = false)
    private Integer hotelingId;

    @Column(name = "h_original_file", nullable = false)
    private String hOriginalFile;

    @Column(name = "h_update_file")
    private String hUpdateFile;
}
