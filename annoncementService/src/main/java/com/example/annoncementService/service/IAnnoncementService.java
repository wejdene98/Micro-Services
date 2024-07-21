package com.example.annoncementService.service;

import java.util.List;

import com.example.annoncementService.entities.Announcement;
import com.example.annoncementService.entities.Announcement;

public interface IAnnoncementService {
    public Announcement add(Announcement announcement);
    public List<Announcement> findAll();
    public Announcement update(Long id, Announcement announcement);
    public Announcement findById(Long id);
    public void _delete(Long id);
}

