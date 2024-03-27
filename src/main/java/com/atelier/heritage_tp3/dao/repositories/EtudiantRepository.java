package com.atelier.heritage_tp3.dao.repositories;

import com.atelier.heritage_tp3.dao.entities.Etudiant;
import com.atelier.heritage_tp3.dao.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository  extends JpaRepository<Etudiant, Integer> {
}
