package com.example.annoncementService.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;
import com.example.annoncementService.entities.Announcement;
import com.example.annoncementService.service.IAnnoncementService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/aservice/annoncement")
@AllArgsConstructor
public class AnnoncementController {
    IAnnoncementService iAnnoncementService;

    @GetMapping
    public ResponseEntity<List<Announcement>> getAll() {
        List<Announcement> announcements = iAnnoncementService.findAll();
        return new ResponseEntity<>(announcements, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Announcement> getById(@PathVariable("id") Long id) {
        Announcement announcement = iAnnoncementService.findById(id);
        return new ResponseEntity<>(announcement, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Announcement> add(@RequestBody Announcement announcement) {
        announcement.setCreatedAt(LocalDateTime.now());
        Announcement createdAnnoncement = iAnnoncementService.add(announcement);

        return new ResponseEntity<>(createdAnnoncement, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Announcement> update(@PathVariable("id") Long id, @RequestBody Announcement announcement) {
        Announcement updatedAnnoncement = iAnnoncementService.update(id, announcement);
        return new ResponseEntity<>(updatedAnnoncement, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        iAnnoncementService._delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
