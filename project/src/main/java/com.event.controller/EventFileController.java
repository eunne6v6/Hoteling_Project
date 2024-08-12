package com.event.controller;

import com.event.entity.EventFile;
import com.event.service.EventFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventfiles")
public class EventFileController {

    @Autowired
    private EventFileService eventFileService;

    @GetMapping
    public List<EventFile> getAllEventFiles() {
        return eventFileService.getAllEventFiles();
    }

    @GetMapping("/{id}")
    public EventFile getEventFileById(@PathVariable int id) {
        return eventFileService.getEventFileById(id);
    }

    @PostMapping
    public EventFile createEventFile(@RequestBody EventFile eventFile) {
        return eventFileService.saveEventFile(eventFile);
    }

    @DeleteMapping("/{id}")
    public void deleteEventFile(@PathVariable int id) {
        eventFileService.deleteEventFile(id);
    }
}
