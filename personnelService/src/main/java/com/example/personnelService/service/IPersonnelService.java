package com.example.personnelService.service;

import java.util.List;
import com.example.personnelService.entities.Personnel;

public interface IPersonnelService {
    public Personnel add(Personnel personnel);
    public List<Personnel> findAll();
    public Personnel update(Long id, Personnel personnel);
    public Personnel findById(Long id);
    public void _delete(Long id);
}
