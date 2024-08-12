package com.event.entity;

import javax.persistence.*;

@Entity  // JPA가 이 클래스를 데이터베이스 테이블로 매핑하도록 표시
public class EventFile {

    @Id  // 이 필드를 기본 키로 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 기본 키 생성을 데이터베이스에 위임
    private Integer eventFileId;

    private String eventFilename;

    @Lob  // 대용량 파일 데이터를 저장하기 위해 @Lob 사용
    private byte[] eventFile;

    @ManyToOne  // 다대일 관계 설정
    @JoinColumn(name = "event_id")  // 외래 키를 지정
    private Event event;

    // Getters and Setters 생략 (자동 생성할 수 있음)
    public Integer getEventFileId() {
        return eventFileId;
    }

    public void setEventFileId(Integer eventFileId) {
        this.eventFileId = eventFileId;
    }

    public String getEventFilename() {
        return eventFilename;
    }

    public void setEventFilename(String eventFilename) {
        this.eventFilename = eventFilename;
    }

    public byte[] getEventFile() {
        return eventFile;
    }

    public void setEventFile(byte[] eventFile) {
        this.eventFile = eventFile;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
