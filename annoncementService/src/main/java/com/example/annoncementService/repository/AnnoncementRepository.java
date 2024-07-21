package com.example.annoncementService.repository;

import com.example.annoncementService.entities.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnnoncementRepository extends JpaRepository<Announcement, Long> {
    Optional<Announcement> findAnnouncementById(Long id);
}