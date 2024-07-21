package com.example.personnelService.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;

import com.example.personnelService.entities.Personnel;
import com.example.personnelService.service.IPersonnelService;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/pservice/personnel")
@AllArgsConstructor
public class PersonnelController {
    IPersonnelService personnelService;

    @GetMapping
    public ResponseEntity<List<Personnel>> getAll() {
        List<Personnel> personnels = personnelService.findAll();
        return new ResponseEntity<>(personnels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personnel> getById(@PathVariable("id") Long id) {
        Personnel personnel = personnelService.findById(id);
        return new ResponseEntity<>(personnel, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Personnel> add(@RequestBody Personnel personnel) {
        Personnel createdPersonnel = personnelService.add(personnel);
        return new ResponseEntity<>(createdPersonnel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personnel> update(@PathVariable("id") Long id, @RequestBody Personnel personnel) {
        Personnel updatedPersonnel = personnelService.update(id, personnel);
        return new ResponseEntity<>(updatedPersonnel, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        personnelService._delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
