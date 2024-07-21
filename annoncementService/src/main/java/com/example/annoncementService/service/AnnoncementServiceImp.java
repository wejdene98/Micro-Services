package com.example.annoncementService.service;

import com.example.annoncementService.repository.AnnoncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.annoncementService.entities.Announcement;
import com.example.annoncementService.exceptions.NotFoundException;

import java.util.List;

@Service
public class AnnoncementServiceImp implements IAnnoncementService {
    @Autowired
    AnnoncementRepository annoncementRepository;

    public Announcement add(Announcement announcement) {
        return annoncementRepository.save(announcement);

    }

    public List<Announcement> findAll() {
        return annoncementRepository.findAll();
    }

    public Announcement update(Long id, Announcement announcement) {
        Announcement announcementToUpdate = annoncementRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Announcement Not Found"));

        announcement.setId(announcementToUpdate.getId());
        return annoncementRepository.save(announcement);
    }

    public Announcement findById(Long id) {
        Announcement foundAnnoncement= annoncementRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Announcement Not Found"));
        return foundAnnoncement;
    }

    public void _delete(Long id) {
        annoncementRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Announcement Not Found"));

        annoncementRepository.deleteById(id);
    }
}


