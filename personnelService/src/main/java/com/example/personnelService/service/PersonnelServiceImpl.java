package com.example.personnelService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.personnelService.entities.Personnel;
import com.example.personnelService.exceptions.NotFoundException;
import com.example.personnelService.repository.PersonnelRepository;

import java.util.List;

@Service
public class PersonnelServiceImpl implements IPersonnelService {
    @Autowired
    PersonnelRepository personnelRepo;

    public Personnel add(Personnel personnel) {
        return personnelRepo.save(personnel);
    }

    public List<Personnel> findAll() {
        return personnelRepo.findAll();
    }

    public Personnel update(Long id, Personnel personnel) {
        // * Make sure the personnel exists
        Personnel personnelToUpdate = personnelRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Personnel Not Found"));

        // * Update the personnel
        personnel.setId(personnelToUpdate.getId());
        return personnelRepo.save(personnel);
    }

    public Personnel findById(Long id) {
        Personnel foundPersonnel = personnelRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Personnel Not Found"));
        return foundPersonnel;
    }

    public void _delete(Long id) {
        // * Make sure the personnel exists
        personnelRepo.findById(id)
                .orElseThrow(() -> new NotFoundException("Personnel Not Found"));

        personnelRepo.deleteById(id);
    }
}
