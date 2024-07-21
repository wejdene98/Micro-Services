package com.example.personnelService.repository;

import com.example.personnelService.entities.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
    Optional<Personnel> findPersonnelById(Long id);
}
