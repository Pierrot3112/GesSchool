package com.pierrot.gesSchool.service;

import com.pierrot.gesSchool.model.Eleves;
import com.pierrot.gesSchool.repository.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EleveService {

    @Autowired
    private EleveRepository eleveRepository;

    public List<Eleves> getAllEleves() {
        return eleveRepository.findAll();
    }

    public Optional<Eleves> getEleveById(Long id) {
        return eleveRepository.findById(id);
    }

    public Eleves saveEleve(Eleves eleve) {
        return eleveRepository.save(eleve);
    }

    public void deleteEleve(Long id) {
        eleveRepository.deleteById(id);
    }

    public Eleves updateEleve(Long id, Eleves eleveDetails) {
        Eleves eleve = eleveRepository.findById(id).orElseThrow(() -> new RuntimeException("Eleve not found"));

        eleve.setNom(eleveDetails.getNom());
        eleve.setPrenom(eleveDetails.getPrenom());
        eleve.setDateNaissance(eleveDetails.getDateNaissance());
        eleve.setAdresse(eleveDetails.getAdresse());
        eleve.setSexe(eleveDetails.getSexe());
        eleve.setEcoleOrigine(eleveDetails.getEcoleOrigine());
        eleve.setClasse(eleveDetails.getClasse());
        eleve.setMatricule(eleveDetails.getMatricule());
        eleve.setNomPere(eleveDetails.getNomPere());
        eleve.setProfessionPere(eleveDetails.getProfessionPere());
        eleve.setNomMere(eleveDetails.getNomMere());
        eleve.setProfessionMere(eleveDetails.getProfessionMere());
        eleve.setContactParent(eleveDetails.getContactParent());
        eleve.setAdresseParent(eleveDetails.getAdresseParent());
        eleve.setImageEleve(eleveDetails.getImageEleve());

        return eleveRepository.save(eleve);
    }
}
