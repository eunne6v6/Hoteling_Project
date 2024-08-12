package com.event.repository;

import com.event.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // 스프링에게 이 인터페이스가 리포지토리임을 알립니다
public interface EventRepository extends JpaRepository<Event, Integer> {
    // JpaRepository 인터페이스는 기본적인 CRUD 메서드를 제공합니다.
    // 예: save(), findById(), findAll(), delete() 등
}
