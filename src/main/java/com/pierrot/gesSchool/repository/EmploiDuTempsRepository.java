package com.pierrot.gesSchool.repository;

import com.pierrot.gesSchool.model.EmploiDuTemps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmploiDuTempsRepository extends JpaRepository<EmploiDuTemps, Long> {
    List<EmploiDuTemps> findByClasseNom(String nomClasse);
}
