package com.pierrot.gesSchool.repository;

import com.pierrot.gesSchool.model.Eleves;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveRepository extends JpaRepository<Eleves, Long> {
}
