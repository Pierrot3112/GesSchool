package com.pierrot.gesSchool.service;

import com.pierrot.gesSchool.model.EmploiDuTemps;
import com.pierrot.gesSchool.repository.EmploiDuTempsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploiDuTempsService {

    private final EmploiDuTempsRepository emploiDuTempsRepository;

    @Autowired
    public EmploiDuTempsService(EmploiDuTempsRepository emploiDuTempsRepository) {
        this.emploiDuTempsRepository = emploiDuTempsRepository;
    }

    public List<EmploiDuTemps> findByClasse(String classe) {
        return emploiDuTempsRepository.findByClasseNom(classe);
    }

    public void saveAll(List<EmploiDuTemps> emploiDuTempsList) {
        emploiDuTempsRepository.saveAll(emploiDuTempsList);
    }

    // Autres méthodes de service...
}

