package com.event.service;

import com.event.entity.EventFile;
import com.event.repository.EventFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventFileService {

    @Autowired
    private EventFileRepository eventFileRepository;

    public List<EventFile> getAllEventFiles() {
        return eventFileRepository.findAll();
    }

    public EventFile getEventFileById(int id) {
        return eventFileRepository.findById(id).orElse(null);
    }

    public EventFile saveEventFile(EventFile eventFile) {
        return eventFileRepository.save(eventFile);
    }

    public void deleteEventFile(int id) {
        eventFileRepository.deleteById(id);
    }
}
