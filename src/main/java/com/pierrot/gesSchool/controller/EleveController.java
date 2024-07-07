package com.pierrot.gesSchool.controller;

import com.pierrot.gesSchool.model.Eleves;
import com.pierrot.gesSchool.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/eleves")
public class EleveController {

    @Autowired
    private EleveService eleveService;

    @GetMapping
    public List<Eleves> getAllEleves() {
        return eleveService.getAllEleves();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Eleves> getEleveById(@PathVariable Long id) {
        Optional<Eleves> eleve = eleveService.getEleveById(id);
        return eleve.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Eleves> createEleve(@RequestBody Eleves eleve) {
        try {
            Eleves createdEleve = eleveService.saveEleve(eleve);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdEleve);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Eleves> updateEleve(@PathVariable Long id, @RequestBody Eleves eleveDetails) {
        try {
            Eleves updatedEleve = eleveService.updateEleve(id, eleveDetails);
            return ResponseEntity.ok(updatedEleve);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEleve(@PathVariable Long id) {
        try {
            eleveService.deleteEleve(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
    }
}