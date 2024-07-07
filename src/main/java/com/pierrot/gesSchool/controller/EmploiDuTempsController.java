package com.pierrot.gesSchool.controller;

import com.pierrot.gesSchool.model.EmploiDuTemps;
import com.pierrot.gesSchool.repository.ClasseRepository;
import com.pierrot.gesSchool.repository.EmploiDuTempsRepository;
import com.pierrot.gesSchool.service.EmploiDuTempsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/emploiDuTemps")
public class EmploiDuTempsController {

    private final EmploiDuTempsService emploiDuTempsService;

    @Autowired
    public EmploiDuTempsController(EmploiDuTempsService emploiDuTempsService) {
        this.emploiDuTempsService = emploiDuTempsService;
    }

    @GetMapping
    public ResponseEntity<List<EmploiDuTemps>> getEmploiDuTempsByClasse(@RequestParam("classe") String classe) {
        List<EmploiDuTemps> emploiDuTempsList = emploiDuTempsService.findByClasse(classe);
        return ResponseEntity.ok().body(emploiDuTempsList);
    }

    @PostMapping
    public ResponseEntity<String> saveEmploiDuTemps(@RequestBody List<EmploiDuTemps> emploiDuTempsList) {
        emploiDuTempsService.saveAll(emploiDuTempsList); // Assurez-vous d'avoir le service approprié pour sauvegarder les données
        return ResponseEntity.status(HttpStatus.CREATED).body("Emploi du temps enregistré avec succès.");
    }
}
