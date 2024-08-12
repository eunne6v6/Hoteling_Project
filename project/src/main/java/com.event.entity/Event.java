package com.event.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity  // JPA가 이 클래스를 데이터베이스 테이블로 매핑하도록 표시
public class Event {

    @Id  // 이 필드를 기본 키로 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 기본 키 생성을 데이터베이스에 위임
    private Integer eventId;

    private String title;

    @Lob  // 대용량 텍스트 저장을 위해 @Lob 사용
    private String content;

    @Temporal(TemporalType.DATE)  // 날짜 필드임을 명시
    private Date createdAt;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<EventFile> eventFiles;

    // Getters and Setters 생략 (자동 생성할 수 있음)
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<EventFile> getEventFiles() {
        return eventFiles;
    }

    public void setEventFiles(List<EventFile> eventFiles) {
        this.eventFiles = eventFiles;
    }
}
